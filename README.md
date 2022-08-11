[![REUSE status](https://api.reuse.software/badge/github.com/SAP-samples/cap-distributed-resiliency)](https://api.reuse.software/info/github.com/SAP-samples/cap-distributed-resiliency)

# Distributed Resiliency of SAP CAP applications
This repository contains design patterns, code samples and step-by-step instructions to enable *Distributed Resiliency in CAP applications*. 
## Description
Resilience, or resilient software design, is about handling failures that occur in complex system landscapes during runtime and ideally should not be noticed by the users. As opposed to traditional stability approaches, its goal is not to reduce the probability of failure occurrence, but to maximize the availability of systems and system landscapes. It accepts the unavoidability and unpredictability of failures and focuses on dealing with them as quickly as possible.

There are many different principles and patterns you can use to make your software resilient. It is, however, not always easy to find the combination that best fits your applications. The [Developing Resilient Apps on SAP BTP Guide](https://help.sap.com/viewer/eadaa45871804b4a974be865f627e791/Cloud/en-US/d1fe5fd8ecfb46c193221ebb991af3d7.html) gives an overview of the various options you have when developing applications and detailed information about the individual patterns you can use.


In SAP Business Technology Platform, you can make use of the Availability Zones (AZ). The Availability Zones (AZ) are single failure domains within a single geographical region and are separate physical locations with independent power, network, and cooling. Multiple AZs exist in one region and are connected with each other through a low-latency network.

The SAP BTP services such as SAP Launchpad and SAP HANA Cloud are deployed across multiple Availability zones (AZ), which improves the availability of service if there are issues with the infrastructure of one AZ. 

Most of the applications can achieve high levels of resiliency with a standard Availability zones (AZ) setup, but these might not work in case of natural disasters, which usually be across regions or it can be a case of SAP BTP service upgrade across regions, where there will be an outage for few hours. 

In such cases, it is recommended to run your application in active-active (Distributed Resiliency) across regions. The following implementations discuss the best practices and reference blueprints for distributed resilient application design on the SAP Business Technology Platform, which integrates applications with cloud services and solutions on multiple cloud platforms.

## Implementations

#### [SAP HANA Cloud (Multi-Zone Replication) with Azure Traffic Manager](https://github.com/SAP-samples/cap-distributed-resiliency/tree/SAP-HANA-Cloud)

In this scenario, you will learn how to achieve the Distributed Resiliency on CAP application using SAP HANA Cloud Database & Azure traffic manager.

#### [Amazon Aurora (Read Replica) with Amazon Route 53](https://github.com/SAP-samples/cap-distributed-resiliency/tree/Amazon-Aurora)

In this scenario, you will learn how to achieve the Distributed Resiliency of CAP applications using Amazon Aurora Database & Amazon Route 53.

## How to obtain support
[Create an issue](https://github.com/SAP-samples/cap-distributed-resiliency/issues) in this repository if you find a bug or have questions about the content.
 
For additional support, [ask a question in SAP Community](https://answers.sap.com/questions/ask.html).
## Code of Conduct
Refer to [CODE OF CONDUCT](CODE_OF_CONDUCT.md) file.

## Contributing
If you wish to contribute code, offer fixes or improvements, please send a pull request. Due to legal reasons, contributors will be asked to accept a DCO when they create the first pull request to this project. This happens in an automated fashion during the submission process. SAP uses [the standard DCO text of the Linux Foundation](https://developercertificate.org/).

## License
Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved. This project is licensed under the Apache Software License, version 2.0 except as noted otherwise in the [LICENSE](LICENSE) file..