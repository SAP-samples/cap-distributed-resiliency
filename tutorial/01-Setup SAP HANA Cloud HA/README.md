# Setup SAP HANA Cloud - Availability Zones and Replicas

### You will learn
 - How to design SAP HANA Cloud fault-resistant architecture
 - How to set up SAP HANA Cloud Single and Multi-Zone Replication
 - Manual Takeover using SAP HANA Cloud Central

> ### Prerequisites
> - Production environment of SAP HANA Cloud, since deploying replicas is not available for SAP HANA Cloud Trial instances.


## Create SAP HANA Cloud Instance
To create your first instance of `SAP HANA Cloud, SAP HANA database`, you need to follow these steps:

1. In SAP BTP cockpit, enter your global account, subaccount, and space.

2. On the menu on left side of the screen, click on SAP HANA Cloud. Then, click on SAP HANA database.
 
    ![Hana Cloud](./images/01.png)

3. A new tab will open in SAP HANA Cloud Central, and you will see the SAP HANA database provisioning wizard.

    ![HANA Cloud Central](./images/02.png)

4. Here choose the `SAP HANA Cloud, SAP HANA Database` and click on Next Step to continue.

5. Here you can see that your organization and space have been preselected. If you are part of multiple organizations or spaces, you can select others in the drop-down menu.
    ![HANA Cloud Central Basics](./images/03.png)

6. In the Basics section, enter a name for your instance in the field Instance Name, Administrator Password and then click on Next Step to continue.
    

7.  Here select how much Memory you wish to allocate and continue to next step
    ![HANA Cloud Central Memory](./images/04.png)

    Follow this [link](https://help.sap.com/docs/PRODUCT_ID/9ae9104a46f74a6583ce5182e7fb20cb/f7febb16072b41f7ac90abf5ea1d4b86.html?state=PRODUCTION&version=LATEST&locale=en-US) to learn more about the memory allocation.

8. In this step, we enter into the core of this topic of `Availability Zones and Replicas`. 
    
    SAP HANA Cloud offers options to replicate your SAP HANA Cloud database synchronously within the same availability zone or asynchronously to other availability zones. With these options, you can set up a Highly Available (HA) architecture and/or a Disaster Recovery (DR) architecture in a few clicks.
   
    **High Availability architecture**

    With Single-Zone Replication, SAP HANA Cloud database offers a controlled synchronous replication with autonomous failover capability.  The fail detection is autonomous, when the nameserver detects a fault in the primary database, the host automatically fails over to the replica.    

    **Disaster Recovery architecture**
    
    With a Multi-Zone replication architecture, you can enable both Synchronous replication to the same availability zone, as well as Asynchronous replication to another availability zone within the same region. The goal of asynchronous replication is to ensure business continuity even in the case of a whole availability zone failing.
    
    If a technical issue happens within your main SAP HANA Cloud instance, a takeover is automatically triggered to the replica within the same Availability Zone. The latency is extremely minimal and takeover time is measured in seconds.

    With multi-zone replication, all persistent data is also replicated to another availability zone. If a disaster happens at the data center where your SAP HANA Cloud database is located, you will be able to manually trigger a takeover to your Disaster recovery instance with minimal down-time and data loss.
    
    
    In this example, we are creating a source and synchronous replica in one of the Availability Zone(wesus2-1) and adding asynchronous replicas to different zone(wesus2-2). 
    
    ![HANA Cloud Central Replica](./images/05-1.png)
    
    
    > - In Q1 2022 Multi-Zone High Availability across two Availability Zones (AZs) with synchronous replication has been made available in SAP HANA Cloud. This not only offers you high-availability setups in the same Availability Zone but also to run with multiple zones to increase availability in case of failing zones.
    Check the technical [documentation](https://help.sap.com/docs/HANA_CLOUD_DATABASE/f9c5015e72e04fffa14d7d4f7267d897/2c325f7b30ba43ac93ca514eba505a33.html) for increasing System Availability
    
    >- Additional costs incurred by creating replicas are based on the size (CPU, memory, disk) of the replica database and its location. You see an estimate of the costs while creating a new instance. You can also use the SAP HANA Cloud Capacity Unit estimator to estimate costs.
    
   
10. Once you have set up the replicas, you can choose to allow access to your SAP HANA database instance from outside of the SAP Business Technology Platform.

    ![HANA Cloud Central allow](./images/06.png)

11. Finally click Review and Create the Instance.
    

## Managing Replicas

Once a synchronous replica is created, you can monitor it through SAP HANA Cockpit as a regular SAP HANA Cloud database. It will appear on your cockpit as a second host with the same HANA instance. The name of the replica will be the name of your main instance suffixed with a number. The replica instance is ready to automatically take over if an issue happens.

 ![HANA Cloud Central manage sync](./images/07.png)

The asynchronous replica does not appear on the SAP HANA cockpit. It is a different SAP HANA Cloud instance, which users do not need to access under normal circumstances.
The system replication can be verified using system views `M_SERVICE_REPLICATION` and `M_SYSTEM_REPLICATION` 

![HANA Cloud Central manage sync](./images/08.png)

When a disaster happens on the primary database, you can manually perform a takeover to the replica through SAP HANA Cloud Central.
![HANA Cloud Central manage sync](./images/09.png)


Now you have a SAP HANA Cloud instance with synchronous and asynchronous replication. In the next tutorial, learn about developing resilient CAP application to access your database instance.
