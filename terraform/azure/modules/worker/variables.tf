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
variable "controller_region_name" {
  type = string
}
variable "controller_vnet_id" {
  type    = string
}
variable "controller_vnet_name" {
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
