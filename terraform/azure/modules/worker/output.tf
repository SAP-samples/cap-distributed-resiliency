output "worker_region_name" {
  value = var.region_name
}
output "region_display_name" {
  value = var.region_display_name
}
output "worker_ip_address" {
  value = azurerm_container_group.worker.ip_address
}