
# Distributed Resiliency for CAP applications
This repository contains design patterns, code samples and step by step instructions to enable *Distributed Resiliency in CAP applications*. 
## Introduction
Resilience, or resilient software design, is about handling failures that occur in complex system landscapes during runtime and ideally should not be noticed by the users. As opposed to traditional stability approaches, its goal is not to reduce the probability of failure occurrence, but to maximize the availability of systems and system landscapes. It accepts the unavoidability and unpredictability of failures and focuses on dealing with them as quickly as possible.

There are many different principles and patterns you can use to make your software resilient. It is, however, not always easy to find the combination that best fits your applications. The [Developing Resilient Apps on SAP BTP Guide](https://help.sap.com/viewer/eadaa45871804b4a974be865f627e791/Cloud/en-US/d1fe5fd8ecfb46c193221ebb991af3d7.html) gives an overview of the various options you have when developing applications and detailed information about the individual patterns you can use.

### High Availability at Platform and Services

In SAP Business Technology Platform, you can make use of the Availability Zones (AZ). The Availability Zones (AZ) are single failure domains within a single geographical region and are separate physical locations with independent power, network, and cooling. Multiple AZs exist in one region and are connected with each other through a low-latency network.

The SAP BTP services such as SAP Launchpad and SAP HANA Cloud are deployed across multiple Availability zones (AZ), which improves the availability of a service if there are issues with the infrastructure of one AZ. 

### High Availability at Application Level

When developing applications, we have to consider different aspects of the applications to support resiliency. There are different tiers, while developing CAP applications.

The **Presentation/Web tier** is the user interface and communication layer of the application, where the end user interacts with the application. This tier is typically developed using SAP UI5 or HTML5 technology. The SAP Launchpad service is used as a central entry point to these apps.  The high availability on this tier can be improved using Availability zones (AZ).

The **Application tier** is heart of the application, where all the business logic is used to process the information from the presentation tier. This tier is often developed using different buildpacks provided by SAP BTP Cloud Foundry environment.  It also utilizes different services offered by SAP Business Technology Platform. We recommend running multiple application instances to increase the availability on this tier.

The **Data tier** is located at the backend where the information provided is managed, stored, and retrieved when needed.  This tier is mostly developed using SAP HANA Cloud.  
In Q1 2022 Multi-Zone High Availability across two availability zones (AZs) with synchronous replication has been made available in SAP HANA Cloud. This not only offers you high-availability setups in the same availability zone but also to run with multiple zones to increase availability in case of failing zones.

### Challenge
Most of the applications can achieve high levels of resiliency with a standard Availability zones (AZ) setup, but these might not work in case of natural disaster, which usually be across region or it can be a case of SAP BTP service upgrade across regions, where there will be an outage for few hours. 

In such cases, it is recommended to run your application in active-active (Distributed Resiliency) across regions. This also helps to achieve a different other objectives as follows
-   Low latency for globally distributed audience
-   Always-on availability for complete regional outages
-   Best utilization of platform resources in multiple data centers.

This mission discusses the fundamental design patterns and sample implementations to build highly resilient applications on SAP Business Technology Platform (BTP) to meet the mission critical application requirements.

## CAP application Resiliency Implementations
We discuss the best practices and reference blueprints for specific resilient application design on SAP Business Technology Platform, which integrates applications with cloud services and solutions on multiple cloud platforms. 

#### [SAP HANA Cloud (Multi-Zone Replication) with Azure Traffic Manager](./Application%20Resiliency/SAP%20HANA%20Cloud/README.md)

In this scenario, you will learn how to achieve the Distributed Resiliency on CAP application using SAP HANA Cloud Database & Azure traffic manager.

This scenario is recommended for building modern applications and analytics solutions across all enterprise data with cloud-native scalability, speed, and performance. This will not address the data availability and latency use cases across the regions.

#### [Amazon Aurora (Read Replica) with Amazon Route 53](./Application%20Resiliency/Amazon%20Aurora/README.md)

In this scenario, you will learn how to achieve the Distributed Resiliency of CAP applications using Amazon Aurora Database & Amazon Route 53.

This scenario is recommended for building modern applications with data availability across the regions. This will not address the data latency issue across the regions and realtime analytics solutions.

## Operational Resiliency Implementations
The best design also requires operational excellence to ensure high availability and mitigate the downtime. The following implementations help for that.


**Application Deployment**: The most common causes of the failures are due to improper code and deployment failures. SAP BTP offers well-defined CI/CD Pipeline and Transport Management service to accomplish this

#### [Setup of Continuous Integration and Continuous Delivery (CI/CD)](./Operational%20Resiliency/CICD/README.md)

#### [Setup of Cloud Transport Management](./Operational%20Resiliency/TMS/README.md)

**Monitoring**: The high availability applications requires the ability to detect the failures and quickly recover from them. SAP BTP offers Application Logging and Alert Notification service to accomplish this

#### [Access and Discover Application Logs and Metrics](./Operational%20Resiliency/Logging/README.md)

#### [Setup of Alert Notification](./Operational%20Resiliency/Logging/README.md)

**Automation**: Automation is critical to maintaining high availability and fast recovery. SAP BTP offers Automation Pilot to accomplish this

#### [SAP Automation Pilot](https://help.sap.com/docs/AUTOMATION_PILOT)

## Known Issues
Refer to different implementations Known Issues section

## How to obtain support
[Create an issue](https://github.com/SAP-samples/cap-distributed-resiliency/issues) in this repository if you find a bug or have questions about the content.
 
For additional support, [ask a question in SAP Community](https://answers.sap.com/questions/ask.html).
## Code of Conduct
Refer to [CODE OF CONDUCT](CODE_OF_CONDUCT.md) file.

## Contributing
If you wish to contribute code, offer fixes or improvements, please send a pull request. Due to legal reasons, contributors will be asked to accept a DCO when they create the first pull request to this project. This happens in an automated fashion during the submission process. SAP uses [the standard DCO text of the Linux Foundation](https://developercertificate.org/).

## License
Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved. This project is licensed under the Apache Software License, version 2.0 except as noted otherwise in the [LICENSE](LICENSE) file..
