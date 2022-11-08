[![REUSE status](https://api.reuse.software/badge/github.com/SAP-samples/cap-distributed-resiliency)](https://api.reuse.software/info/github.com/SAP-samples/cap-distributed-resiliency)

# SAP CAP Application Dynamic Data Source Routing
A very common use case that we experience while designing an application is the necessity to switch databases on the fly based on region or read/write activity in order to reduce latency and boost availability.

Consider a geo-distributed app, which spans many geographic locations to ensure high availability, resiliency, compliance, and performance. The application layer is distributed across regions and linked to distributed databases. As a result, the application layer is highly available and reliable. Furthermore, the geo-distributed app can fulfil user requests with little latency, regardless of the user’s location.

The user data should be located as close to the application instance as possible for optimal performance. Let’s examine various data storage distribution patterns for DB operations.

Read local/write locally: In this pattern, all the read and write requests are served from the local region. It will not only help in reducing the latency but also reduce the potential for network errors. There are few global databases having support for this functionality, Amazon DynamoDB is a great example to understand this pattern.
Read local/write global: In this pattern, specific region works as a global write region. All the write operations will be performed in this region, while read requests can be served from any region. Amazon Aurora is a great example to understand this pattern.
Read local/write partitioned: In this pattern, each item or record is assigned to a home region. Here we map records with partition key (such as user ID) to a home region close to where most write requests will originate.
There are several techniques for implementing patterns 2 and 3 at the application layer, but we will concentrate on the spring boot dynamic data source routing approach to disperse database operations.

## How to obtain support
[Create an issue](https://github.com/SAP-samples/cap-distributed-resiliency/issues) in this repository if you find a bug or have questions about the content.
 
For additional support, [ask a question in SAP Community](https://answers.sap.com/questions/ask.html).
## Code of Conduct
Refer to [CODE OF CONDUCT](CODE_OF_CONDUCT.md) file.

## Contributing
If you wish to contribute code, offer fixes or improvements, please send a pull request. Due to legal reasons, contributors will be asked to accept a DCO when they create the first pull request to this project. This happens in an automated fashion during the submission process. SAP uses [the standard DCO text of the Linux Foundation](https://developercertificate.org/).

## License
Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved. This project is licensed under the Apache Software License, version 2.0 except as noted otherwise in the [LICENSE](LICENSE) file..