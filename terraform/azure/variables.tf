variable "resource_group_name" {
  type    = string
}
variable "prefix" {
  type    = string
  default = "perftest"
}
variable "config_file" {
  type    = string
  default = null
}
variable "config_branch" {
  type    = string
  default = null
}
variable "config_repo" {
  type    = string
  default = null
}

variable "controller_region" {
  type = object({
    name = string
    display_name = string
    vnet_address_space = string
    subnet_address_prefix = string
  })
}
variable "worker_regions" {
  type = list(object({
    name = string
    display_name = string
    vnet_address_space = string
    subnet_address_prefix = string
  }))
}
variable "jmeter_worker_image" {
  type    = string
}
variable "jmeter_worker_cpu" {
  type    = string
  default = "2.0"
}
variable "jmeter_worker_memory" {
  type    = string
  default = "8.0"
}
variable "jmeter_controller_image" {
  type    = string
}
variable "jmeter_controller_cpu" {
  type    = string
  default = "4.0"
}
variable "jmeter_controller_memory" {
  type    = string
  default = "8.0"
}

