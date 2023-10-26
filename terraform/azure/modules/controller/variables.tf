variable "resource_group_name" {
  type    = string
}
variable "region_name" {
  type = string
}
variable "region_display_name" {
  type = string
}
variable "prefix" {
  type    = string
}
variable "vnet_address_space" {
  type    = string
}
variable "subnet_address_prefix" {
  type    = string
}
variable "jmeter_controller_image" {
  type    = string
}
variable "jmeter_controller_cpu" {
  type    = string
}
variable "jmeter_controller_memory" {
  type    = string
}
variable "jmeter_worker_image" {
  type    = string
}
variable "jmeter_worker_cpu" {
  type    = string
}
variable "jmeter_worker_memory" {
  type    = string
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