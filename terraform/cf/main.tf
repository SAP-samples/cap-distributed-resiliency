
###############################################################################################
# Setup of names in accordance to naming convention
###############################################################################################
locals {
  random_uuid               = uuid()
  subaccount_domain = lower(replace(var.subaccount_name,  " ", "-"))
  subaccount_cf_org = substr(replace("${local.subaccount_domain}", "-", ""), 0, 32)
}
###############################################################################################
# Creation of subaccount
###############################################################################################
resource "btp_subaccount" "subaccount" {
  name      = var.subaccount_name
  subdomain = local.subaccount_domain
  region    = lower(var.region)
  parent_id = var.parent_directory
  labels = {
    "owner" : ["${var.username}"]
  }
  usage     = "USED_FOR_PRODUCTION"
}
resource "btp_subaccount_role_collection_assignment" "subaccount-admins" {
  for_each             = toset("${var.subaccount_admins}")
  subaccount_id        = btp_subaccount.subaccount.id
  role_collection_name = "Subaccount Administrator"
  user_name            = each.value
}

######################################################################
# Creation of Cloud Foundry environment
######################################################################
module "cloudfoundry_environment" {
  source                = "./modules/envinstance-cloudfoundry/"
  subaccount_id         = btp_subaccount.subaccount.id
  instance_name         = local.subaccount_cf_org
  plan_name             = "standard"
  cloudfoundry_org_name = local.subaccount_cf_org
}

module "cloudfoundry_space" {
  source              = "./modules/cloudfoundry-space/"
  cf_org_id           = module.cloudfoundry_environment.org_id
  name                = var.cf_space_name
  cf_space_managers   = var.cf_space_managers
  cf_space_developers = var.cf_space_developers
  cf_space_auditors   = var.cf_space_auditors
}

resource "time_sleep" "wait_a_few_seconds" {
  create_duration = "30s"
}

resource "btp_subaccount_entitlement" "cloudfoundry" {
  subaccount_id = btp_subaccount.subaccount.id
  service_name  = "APPLICATION_RUNTIME"
  plan_name     = "MEMORY"
  amount        = 2 # It allocates 1GB RAM to the subaccount
}

data "cloudfoundry_service" "connectivity" {
  name = "connectivity"
}

resource "btp_subaccount_entitlement" "connectivity" {
  depends_on    = [time_sleep.wait_a_few_seconds]
  subaccount_id = btp_subaccount.subaccount.id
  service_name  = data.cloudfoundry_service.connectivity.name
  plan_name     = "lite"
}

resource "cloudfoundry_service_instance" "connectivity" {
  name         = "perftest-connectivity"
  space        = module.cloudfoundry_space.id
  service_plan = data.cloudfoundry_service.connectivity.service_plans["lite"]
  json_params  = null
  depends_on   = [btp_subaccount_entitlement.connectivity]
}

data "cloudfoundry_service" "destination" {
  name = "destination"
}

resource "btp_subaccount_entitlement" "destination" {
  depends_on    = [time_sleep.wait_a_few_seconds]
  subaccount_id = btp_subaccount.subaccount.id
  service_name  = data.cloudfoundry_service.destination.name
  plan_name     = "lite"
}

resource "cloudfoundry_service_instance" "destination" {
  name         = "perftest-destination"
  space        = module.cloudfoundry_space.id
  service_plan = data.cloudfoundry_service.destination.service_plans["lite"]
  json_params  = null
  depends_on   = [btp_subaccount_entitlement.destination]
}

data "cloudfoundry_service" "logging" {
  name = "application-logs"
}
resource "btp_subaccount_entitlement" "logging" {
  depends_on    = [time_sleep.wait_a_few_seconds]
  subaccount_id = btp_subaccount.subaccount.id
  service_name  = data.cloudfoundry_service.logging.name
  plan_name     = "lite"
}

resource "cloudfoundry_service_instance" "logging" {
  name         = "perftest-logging"
  space        = module.cloudfoundry_space.id
  service_plan = data.cloudfoundry_service.logging.service_plans["lite"]
  json_params  = null
  depends_on   = [btp_subaccount_entitlement.logging]
}

data "cloudfoundry_service" "xsuaa" {
  name = "xsuaa"
}

resource "cloudfoundry_service_instance" "xsuaa" {
  name         = "perftest-xsuaa"
  space        = module.cloudfoundry_space.id
  service_plan = data.cloudfoundry_service.xsuaa.service_plans["application"]
  json_params  = null
}

data "cloudfoundry_domain" "cfapps" {
  name = "cfapps.${var.region}.hana.ondemand.com"
}

resource "cloudfoundry_route" "cap-pl" {
  domain   = data.cloudfoundry_domain.cfapps.id
  space    = module.cloudfoundry_space.id
  hostname = "cap-pl"
}


resource "cloudfoundry_app" "cap-pl" {
  space     = module.cloudfoundry_space.id
  name      = "cap-pl"
  path      = "../../applications/cap/private-link/srv/target/performance-exec.jar" 
  routes {
    route = cloudfoundry_route.cap-pl.id
  }
  service_binding {
    service_instance = cloudfoundry_service_instance.xsuaa.id
  }
  service_binding {
    service_instance = cloudfoundry_service_instance.logging.id
  }
  service_binding {
    service_instance = cloudfoundry_service_instance.destination.id
  }
  service_binding {
    service_instance = cloudfoundry_service_instance.connectivity.id
  }
  depends_on   = [cloudfoundry_service_instance.xsuaa]
}

resource "cloudfoundry_route" "cap-public" {
  domain   = data.cloudfoundry_domain.cfapps.id
  space    = module.cloudfoundry_space.id
  hostname = "cap-public"
}


resource "cloudfoundry_app" "cap-public" {
  space     = module.cloudfoundry_space.id
  name      = "cap-public"
  path      = "../../applications/cap/public/srv/target/performance-exec.jar" 
  routes {
    route = cloudfoundry_route.cap-public.id
  }
  service_binding {
    service_instance = cloudfoundry_service_instance.xsuaa.id
  }
  service_binding {
    service_instance = cloudfoundry_service_instance.logging.id
  }
  service_binding {
    service_instance = cloudfoundry_service_instance.destination.id
  }
  service_binding {
    service_instance = cloudfoundry_service_instance.connectivity.id
  }
  depends_on   = [cloudfoundry_service_instance.xsuaa]
}

resource "cloudfoundry_route" "cap-cc" {
  domain   = data.cloudfoundry_domain.cfapps.id
  space    = module.cloudfoundry_space.id
  hostname = "cap-cc"
}


resource "cloudfoundry_app" "cap-public" {
  space     = module.cloudfoundry_space.id
  name      = "cap-cc"
  path      = "../../applications/cap/cloud-connector/srv/target/performance-exec.jar" 
  routes {
    route = cloudfoundry_route.cap-cc.id
  }
  service_binding {
    service_instance = cloudfoundry_service_instance.xsuaa.id
  }
  service_binding {
    service_instance = cloudfoundry_service_instance.logging.id
  }
  service_binding {
    service_instance = cloudfoundry_service_instance.destination.id
  }
  service_binding {
    service_instance = cloudfoundry_service_instance.connectivity.id
  }
  depends_on   = [cloudfoundry_service_instance.xsuaa]
}