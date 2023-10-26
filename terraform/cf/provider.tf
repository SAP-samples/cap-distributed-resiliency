terraform {
  required_providers {
    btp = {
      source  = "sap/btp"
      version = "0.4.0-beta1"
    }
    cloudfoundry = {
      source  = "cloudfoundry-community/cloudfoundry"
      version = "0.51.3"
    }
  }
  backend "local" {
    path = "./.workspace/terraform.tfstate"
  }
}

provider "btp" {
  globalaccount  = var.globalaccount
  cli_server_url = var.cli_server_url
  username      = var.username
  password      = var.password
}

# Get the Cloudfoundry API endpoint
module "cloudfoundry_api" {
  source            = "./modules/envinstance-cloudfoundry-apiurl"
  environment_label = "cf-${var.region}"
}

// Configuration is described in https://registry.terraform.io/providers/cloudfoundry-community/cloudfoundry/latest/docs
provider "cloudfoundry" {
  api_url = module.cloudfoundry_api.api_url
  user      = var.username
  password      = var.password
}