variable "globalaccount" {
  type        = string
  description = "The globalaccount subdomain."
  default     = "yourglobalaccount"
}

variable "username" {
  type        = string
  description = "BTP User Name"
}

variable "password" {
  type        = string
  description = "BTP Password"
}

# subaccount
variable "subaccount_name" {
  type        = string
  description = "The subaccount name."
  default     = "yourglobalaccount"
}
variable "parent_directory" {
  type    = string
}
# Region
variable "region" {
  type        = string
  description = "The region where the project account shall be created in."
  default     = "ca10"
}

# Cloudfoundry space name
variable "cf_space_name" {
  type        = string
  description = "The Cloudfoundry space name"
  default     = "dev"
}
# CLI server
variable "cli_server_url" {
  type        = string
  description = "The BTP CLI server URL."
  default     = "https://cpcli.cf.eu10.hana.ondemand.com"
}

variable "subaccount_admins" {
  type        = list(string)
  description = "Defines the colleagues who are added to each subaccount as subaccount administrators."
  default     = []
}

variable "subaccount_service_admins" {
  type        = list(string)
  description = "Defines the colleagues who are added to each subaccount as subaccount service administrators."
  default     = []
}

variable "cf_space_managers" {
  type        = list(string)
  description = "Defines the colleagues who are Cloudfoundry space managers"
  default     = []
}

variable "cf_space_developers" {
  type        = list(string)
  description = "Defines the colleagues who are Cloudfoundry space developers"
  default     = []
}

variable "cf_space_auditors" {
  type        = list(string)
  description = "Defines the colleagues who are Cloudfoundry space auditors"
  default     = []
}

