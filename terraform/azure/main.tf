module "controller" {
  source = "./modules/controller"
  region_name = var.controller_region.name
  region_display_name = var.controller_region.display_name
  resource_group_name = var.resource_group_name
  prefix=var.prefix
  vnet_address_space=var.controller_region.vnet_address_space
  subnet_address_prefix=var.controller_region.subnet_address_prefix
  jmeter_controller_image = var.jmeter_controller_image
  jmeter_controller_cpu = var.jmeter_controller_cpu
  jmeter_controller_memory = var.jmeter_controller_memory
  jmeter_worker_image = var.jmeter_worker_image
  jmeter_worker_cpu = var.jmeter_worker_cpu
  jmeter_worker_memory = var.jmeter_worker_memory
  config_file = var.config_file
  config_branch = var.config_branch
  config_repo = var.config_repo
}

module "workers" {
  source = "./modules/worker"
  for_each = {for i, r in var.worker_regions:  i => r}
  region_name = each.value.name
  region_display_name = each.value.display_name
  resource_group_name = var.resource_group_name
  prefix=var.prefix
  vnet_address_space=each.value.vnet_address_space
  subnet_address_prefix=each.value.subnet_address_prefix
  controller_region_name = module.controller.region_name
  controller_vnet_id = module.controller.vnet_id
  controller_vnet_name = module.controller.vnet_name
  jmeter_worker_image = var.jmeter_worker_image
  jmeter_worker_cpu = var.jmeter_worker_cpu
  jmeter_worker_memory = var.jmeter_worker_memory
}