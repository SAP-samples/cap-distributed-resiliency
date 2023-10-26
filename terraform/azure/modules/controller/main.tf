resource "azurerm_virtual_network" "vnet" {
  name                = "${var.prefix}-${var.region_name}-vnet"
  location            = var.region_name
  resource_group_name = var.resource_group_name
  address_space       = ["${var.vnet_address_space}"]
}

resource "azurerm_subnet" "subnet" {
  name                 = "${var.prefix}-${var.region_name}-subnet"
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

resource "azurerm_container_group" "controller" {
  name                = "${var.prefix}-${var.region_name}-controller"
  location            = var.region_name
  resource_group_name = var.resource_group_name
  ip_address_type = "Private"
  os_type         = "Linux"
  subnet_ids = [azurerm_subnet.subnet.id]
  restart_policy = "Never"
  
  container {
    name   = "${var.prefix}-controller"
    image  = var.jmeter_controller_image
    cpu    = var.jmeter_controller_cpu
    memory = var.jmeter_controller_memory

    ports {
      port     = 60000
      protocol = "TCP"
    }
    
    environment_variables = {
      config = var.config_file
      branch = var.config_branch
      repo = var.config_repo
    }

  }
}