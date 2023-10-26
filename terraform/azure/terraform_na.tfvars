resource_group_name = "btp-perftest-with-SAP"
config_file = "config-na/SchedulerConfig"
config_branch = "config"
config_repo = "https://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@github.com/SAP-samples/cap-distributed-resiliency.git"

controller_region = {
    name = "canadacentral"
    display_name = "CanadaCentral"
    vnet_address_space = "10.30.0.0/16"
    subnet_address_prefix= "10.30.0.0/24"
}
worker_regions = [
    {
        name = "canadacentral"
        display_name = "CanadaCentral"
        vnet_address_space = "10.31.0.0/16"
        subnet_address_prefix= "10.31.0.0/24"
    },
    {
        name = "canadaeast"
        display_name = "CanadaEast"
        vnet_address_space = "10.32.0.0/16"
        subnet_address_prefix= "10.32.0.0/24"
    },
    {
        name = "eastus2"
        display_name = "EastUS2"
        vnet_address_space = "10.33.0.0/16"
        subnet_address_prefix= "10.33.0.0/24"
    },
    {
        name = "southcentralus"
        display_name = "SouthCentralUS"
        vnet_address_space = "10.34.0.0/16"
        subnet_address_prefix= "10.34.0.0/24"
    },
    {
        name = "westus2"
        display_name = "WestUS2"
        vnet_address_space = "10.35.0.0/16"
        subnet_address_prefix= "10.35.0.0/24"
    }
]
jmeter_controller_image = "ghcr.io/kshanth/jmeter_controller:latest"
jmeter_worker_image = "ghcr.io/kshanth/jmeter_worker:latest"