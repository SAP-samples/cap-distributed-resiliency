
resource "azurerm_virtual_network" "vnet" {
  name                = "${var.prefix}-${var.region_name}-worker-vnet"
  location            = var.region_name
  resource_group_name = var.resource_group_name
  address_space       = ["${var.vnet_address_space}"]
}

resource "azurerm_subnet" "subnet" {
  name                 = "${var.prefix}-${var.region_name}-worker-subnet"
  resource_group_name  = var.resource_group_name
  virtual_network_name = azurerm_virtual_network.vnet.name
  address_prefixes     = ["${var.subnet_address_prefix}"]
  delegation {
    name = "${var.prefix}-${var.region_name}-delegation"
    service_delegation {
      name    = "Microsoft.ContainerInstance/containerGroups"
      actions = ["Microsoft.Network/virtualNetworks/subnets/action"]
    }
  }
}

resource "azurerm_virtual_network_peering" "vnet_peering_controller" {
  name                        = "${var.prefix}-${var.region_name}-controller-to-worker"
  resource_group_name         = var.resource_group_name
  virtual_network_name        = var.controller_vnet_name
  remote_virtual_network_id   = azurerm_virtual_network.vnet.id
  allow_virtual_network_access = true
}
resource "azurerm_virtual_network_peering" "vnet_peering_worker" {
  name                        = "${var.prefix}-${var.region_name}-worker-to-controller"
  resource_group_name         = var.resource_group_name
  virtual_network_name        = azurerm_virtual_network.vnet.name
  remote_virtual_network_id   = var.controller_vnet_id
  allow_virtual_network_access = true
}

resource "azurerm_container_group" "worker" {
  name                = "${var.prefix}-${var.region_name}-worker"
  location            = var.region_name
  resource_group_name = var.resource_group_name
  ip_address_type = "Private"
  os_type         = "Linux"
  subnet_ids = [azurerm_subnet.subnet.id]
  restart_policy = "Never"
  container {
    name   = "${var.prefix}-worker"
    image  = var.jmeter_worker_image
    cpu    = var.jmeter_worker_cpu
    memory = var.jmeter_worker_memory     
    ports {
      port     = 1099
      protocol = "TCP"
    }
    ports {
      port     = 50000
      protocol = "TCP"
    }
    
  }
}