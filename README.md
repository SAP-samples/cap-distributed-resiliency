
# Distributed Resiliency of CAP applications using SAP HANA Cloud (Multi-Zone Replication) with Azure Traffic Manager

This repository contains code samples and step-by-step instructions to enable *Distributed Resiliency of CAP applications using SAP HANA Cloud Multi-Zone Replication with Azure Traffic Manager*.

## Introduction
Resilience, or resilient software design, is about handling failures that occur in complex system landscapes during runtime and ideally should not be noticed by the users. As opposed to traditional stability approaches, its goal is not to reduce the probability of failure occurrence, but to maximize the availability of systems and system landscapes. It accepts the unavoidability and unpredictability of failures and focuses on dealing with them as quickly as possible.

There are many different principles and patterns you can use to make your software resilient. It is, however, not always easy to find the combination that best fits your applications. The [Developing Resilient Apps on SAP BTP Guide](https://help.sap.com/viewer/eadaa45871804b4a974be865f627e791/Cloud/en-US/d1fe5fd8ecfb46c193221ebb991af3d7.html) gives an overview of the various options you have when developing applications and detailed information about the individual patterns you can use.

### Challenge
Most of the applications can achieve high levels of resiliency with a standard Availability zones (AZ) setup, but these might not work in case of natural disaster, which usually on across regions or it can be a case of SAP BTP service upgrade across regions, where there will be an outage for few hours. 

In such cases, it is recommended to run your application in active-active (Distributed Resiliency) across regions.  




## Solution architecture
The conceptual solution diagram below shows a hybrid and multi-cloud architecture design, which integrates applications with cloud services and solutions on multiple cloud platforms.

![Solution Architecture](./images/s1-a1.png)

This reference architecture is for building modern applications and analytics solutions across the enterprise data with cloud-native scalability, speed, and performance. This will not address the data availability and latency use cases that require multi-region availability.

In this scenario, we are going to deploy CAP applications to multiple regions with an active-active setup. SAP HANA Cloud is configured with synchronous and asynchronous replicas on the availability zones (AZs) and Azure Traffic Manager is used for routing incoming requests to SAP BTP subaccounts across different regions based on the maintained configurations, which can performance-based, weighted or geo-based.


  
## Requirements

The required systems and components are:

- SAP BTP PAYGO or CPEA agreement
- 2 SAP BTP subaccounts: e.g. one in AP20, one in US20
- A Microsoft Azure subscription
- An own domain

Entitlements/Quota required in your SAP Business Technology Platform account:

| Service                     | Plan             | Number of instances |
| --------------------------- | ---------------- | ------------------- |
| Custom Domain Service       | Custom Domain    | 2                   |
| SAP HANA Schemas & HDI Containers       | hdi-shared    | 1                   |
| SAP HANA Cloud      | hana    | 1                  |
| Authorization and Trust Management Service      | broker    | 2                   |
| HTML5 Application Repository      | app-host    | 2                   |
| Cloud Foundry runtime     |     | 2                   |
| Application Logging      | lite    | 2                   |
Subscriptions required in your SAP Business Technology Platform Account:

| Subscription               | Plan                                                   |
| -------------------------- | ------------------------------------------------------ |
| SAP Business Application Studio|  Standard (Application)                                |


## Setup and Configuration

#### [Step 1: Setup SAP HANA Cloud - Availability Zones and Replicas](./tutorial/01-Setup%20SAP%20HANA%20Cloud%20HA/README.md)

#### [Step 2: Deploy CAP Java project to different regions](./tutorial/02-Setup%20CAP%20Application/README.md)

#### [Step 3: Map Custom Domain Routes](./tutorial/03-Map%20Custom%20Domain%20Routes/README.md)

#### [Step 4: Setup Azure Traffic Manager](./tutorial/04-Setup%20Azure%20Traffic%20Manager/README.md)

#### [Step 5: Test Failover Scenario](./tutorial/05-Test%20Failover%20Scenario/README.md)

#### [Step 6: Access and Discover Application Logs and Metrics](./tutorial/06-Logging/README.md)

#### [Step 7: Setup of Continuous Integration and Continuous Delivery (CI/CD)](./tutorial/07-CICD/README.md)

#### [Step 8: Setup of SAP Cloud Transport Management to keep tenants in sync](./tutorial/08-TMS/README.md)

#### [Step 9: Setup of Alert Notification](./tutorial/09-ANS/README.md)

#### [Step 10: Additional Findings and Analyses](./tutorial/10-Additional%20Findings/README.md)

## <a name="furtherreading"></a> Further Reading

GitHub: [SAP BTP Cloud Integration Intelligent Routing](https://github.com/SAP-samples/btp-cloud-integration-intelligent-routing)

GitHub: [High Availability of SAP Launchpad service](https://github.tools.sap/btp-use-case-factory/launchpad-ha)

Blogpost: [Architecting Solutions on SAP BTP for High Availability](https://blogs.sap.com/2021/08/17/architecting-solutions-on-sap-btp-for-high-availability/) by [Murali Shanmugham](https://people.sap.com/muralidaran.shanmugham2)

## Known Issues
This scenario will not address any multi-region latency issue, since the SAP HANA Cloud instance is running in one hyperscaler region. The application will access the database across regions, which may lead to latency issues.

## How to obtain support

[Create an issue](https://github.com/SAP-samples/cap-distributed-resiliency/issues) in this repository if you find a bug or have questions about the content.
 
For additional support, [ask a question in SAP Community](https://answers.sap.com/questions/ask.html).

## Contributing
If you wish to contribute code, offer fixes or improvements, please send a pull request. Due to legal reasons, contributors will be asked to accept a DCO when they create the first pull request to this project. This happens in an automated fashion during the submission process. SAP uses [the standard DCO text of the Linux Foundation](https://developercertificate.org/).

## License
Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved. This project is licensed under the Apache Software License, version 2.0 except as noted otherwise in the [LICENSE](LICENSES/Apache-2.0.txt) file.
