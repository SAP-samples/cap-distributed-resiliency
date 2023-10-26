terraform {
  required_providers {
    kubernetes = {
      source  = "hashicorp/kubernetes"
      version = ">= 2.0.0"
    }
  }
  backend "local" {
    path = "./.workspace/terraform.tfstate"
  }
}
provider "kubernetes" {
  config_path = var.config_path
}
provider "helm" {
  kubernetes {
    config_path = var.config_path
  }
}
