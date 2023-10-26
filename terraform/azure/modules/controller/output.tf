output "vnet_id" {
  value = azurerm_virtual_network.vnet.id
}
output "vnet_name" {
  value = "${var.prefix}-${var.region_name}-vnet"
}
output "region_name" {
  value = var.region_name
}
output "region_display_name" {
  value = var.region_display_name
}
output "controller_ip_address" {
  value = azurerm_container_group.controller.ip_address
}
