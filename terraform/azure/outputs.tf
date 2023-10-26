output "controller_ip_address" {
  value = [
    {
      "Name"      : module.controller.region_display_name,
      "IPAddress" : module.controller.controller_ip_address
    }
  ]
}

output "worker_ip_address" {
  value = [
    for i in range(length(module.workers)) :
    {
      "Name"      : module.workers[i].region_display_name,
      "IPAddress" : module.workers[i].worker_ip_address
    }
  ]
}