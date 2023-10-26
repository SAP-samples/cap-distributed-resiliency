resource_group_name = "btp-perftest-with-SAP"
config_file = "config-eu/SchedulerConfig"
config_branch = "config"
config_repo = "https://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@github.com/SAP-samples/cap-distributed-resiliency.git"

controller_region = {
    name = "westeurope"
    display_name = "WestEurope"
    vnet_address_space = "10.40.0.0/16"
    subnet_address_prefix= "10.40.0.0/24"
}
worker_regions = [
    {
        name = "westeurope"
        display_name = "WestEurope"
        vnet_address_space = "10.41.0.0/16"
        subnet_address_prefix= "10.41.0.0/24"
    },
    {
        name = "northeurope"
        display_name = "NorthEurope"
        vnet_address_space = "10.42.0.0/16"
        subnet_address_prefix= "10.42.0.0/24"
    },
    {
        name = "swedencentral"
        display_name = "SwedenCentral"
        vnet_address_space = "10.43.0.0/16"
        subnet_address_prefix= "10.43.0.0/24"
    },
    {
        name = "uksouth"
        display_name = "UKSouth"
        vnet_address_space = "10.44.0.0/16"
        subnet_address_prefix= "10.44.0.0/24"
    },
    {
        name = "germanywestcentral"
        display_name = "GermanyWestCentral"
        vnet_address_space = "10.45.0.0/16"
        subnet_address_prefix= "10.45.0.0/24"
    }
]
jmeter_controller_image = "ghcr.io/kshanth/jmeter_controller:latest"
jmeter_worker_image = "ghcr.io/kshanth/jmeter_worker:latest"