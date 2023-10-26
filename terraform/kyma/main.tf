resource "kubernetes_namespace" "namespace" {
  metadata {
    name = var.namespace
  }
}

resource "helm_release" "influxdb" {
  name       = "influxdb"
  namespace  = kubernetes_namespace.namespace.id
  chart      = "./influxdb"
  wait       = "true"
}

data "kubernetes_service" "influxdb" {
   metadata {
    name = "influxdb"
    namespace  = helm_release.influxdb.namespace
   }
}

resource "helm_release" "grafana" {
  name       = "grafana"
  namespace  = kubernetes_namespace.namespace.id
  chart      = "./grafana"
  values  = [
    templatefile("./grafana/values.tfpl", {
    dashboards = fileset("./grafana/dashboards/", "*.json")
    influxdb_url = "http://${data.kubernetes_service.influxdb.spec[0].cluster_ips[0]}:${data.kubernetes_service.influxdb.spec[0].port[0].port}" 
  })]
}

 data "kubernetes_service" "grafana" {
   metadata {
    name = "grafana"
    namespace  = kubernetes_namespace.namespace.id
  }
}