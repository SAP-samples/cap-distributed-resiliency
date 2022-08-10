# Additional findings and analyses

### You will learn
-  Additional findings and analyses to extend the solution

> ### Prerequisites
> - Make sure all the previous steps are completed and application end points are working.

##  1. Multi region Replication 
 We have the following options currently available to achieve High Availability in SAP HANA Cloud:

   -  Synchronous replication in a single Availability Zone with automatic failover
   -  Asynchronous replication cross Availability Zone, manual takeover
   -  Synchronous replication cross Availability Zone with automatic failover, manual switch is possible 
  
  and also the following roadmap inplace
   -	Asynchronous replication with cross region, manual takeover
   -   Active/Active (read only) support

Currently there is no plan for synchronous replication on cross region and bi-directional replication.

## 2. Cross region Active-Active / Active-Passive setup

**Cross region Active-Active setup:** Currently bi-directional replication with loop back prevention is not possible, so this is difficult to achieve in database layer.  
In application layer, there is a possibility by sending the writes to both the regions. Again to avoid the latency, closest region with synchronous writes and other region using asynchronous ones. Here handling the cross region failover will be difficult.

**Cross region Active-Passive setup:** This is not possible due to current restriction on Multi region Replication. 
By using SAP HANA Smart Data Integration (SDI), one side asynchronous replication is possible, but failover handling is difficult.

## 3. Approximate RPO (Recovery Point Objective)
A Recovery point objectives refer to a company’s loss tolerance. The amount of data that can be lost before significant harm to the business occurs. 

| Traffic Routing | Presentation / Web tier | Application tier | Data tier                                      |
| --------------- | --------------------- | ----------------- | ---------------------------------------------- |
|Based on DNS Time-to-Live (TTL) of the Azure Traffic Manager profile plus an additional two minutes.  Minimum TTL config is possible with 1 second       | Based on the Routing      | Based on the Routing  | Recover from Backup takes less than 15 minutes. |