resource_group_name = "btp-perftest-with-SAP"
config_file = "config-ap/SchedulerConfig"
config_branch = "config"
config_repo = "https://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@github.com/SAP-samples/cap-distributed-resiliency.git"

controller_region = {
    name = "koreacentral"
    display_name = "KoreaCentral"
    vnet_address_space = "10.50.0.0/16"
    subnet_address_prefix= "10.50.0.0/24"
}
worker_regions = [
    {
        name = "koreacentral"
        display_name = "KoreaCentral"
        vnet_address_space = "10.51.0.0/16"
        subnet_address_prefix= "10.51.0.0/24"
    },
    {
        name = "japaneast"
        display_name = "JapanEast"
        vnet_address_space = "10.52.0.0/16"
        subnet_address_prefix= "10.52.0.0/24"
    },
    {
        name = "japanwest"
        display_name = "JapanWest"
        vnet_address_space = "10.53.0.0/16"
        subnet_address_prefix= "10.53.0.0/24"
    },
    {
        name = "eastasia"
        display_name = "EastAsia"
        vnet_address_space = "10.54.0.0/16"
        subnet_address_prefix= "10.54.0.0/24"
    },
    {
        name = "southeastasia"
        display_name = "SoutheastAsia"
        vnet_address_space = "10.55.0.0/16"
        subnet_address_prefix= "10.55.0.0/24"
    }
]
jmeter_controller_image = "ghcr.io/kshanth/jmeter_controller:latest"
jmeter_worker_image = "ghcr.io/kshanth/jmeter_worker:latest"