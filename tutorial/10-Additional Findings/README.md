# Additional findings and analyses

### You will learn
-  Additional findings and analyses to extend the solution

> ### Prerequisites
> - Make sure all the previous steps are completed and application end points are working.

##  1. Using write forwarding in an Amazon Aurora Global Database

This feature lets secondary clusters in an Aurora Global Database forward SQL statements that perform write operations to the primary cluster. The primary cluster updates the source and then propagates resulting changes back to all secondary AWS Regions.

The write forwarding configuration saves you from implementing your own mechanism to send write operations from a secondary AWS region to the primary region. Amazon Aurora handles the cross-region networking setup. Amazon Aurora also transmits all necessary session and transactional context for each statement. The data is always changed first on the primary cluster and then replicated to the secondary clusters in the Amazon Aurora Global Database. This way, the primary cluster is the source of truth and always has an up-to-date copy of all your data.

Enabling write forwarding is **not supported** for Amazon Aurora PostgreSQL-Compatible Edition, it works on the MySQL-Compatible Edition.

##  2. Using Amazon RDS Proxy 
Amazon RDS Proxy is a fully managed, highly available database proxy for Amazon Relational Database Service (RDS) that makes applications more scalable, more resilient to database failures, and more secure.

Aurora global databases currently **don't support** Amazon RDS Proxy. Refer the section [Limitations of Amazon Aurora global databases](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html)

##  3. Using other proxies

HAProxy or Pgpool-II can be used for Load Balancing your PostgreSQL, but this has to be manually installed and configured in EC2 instance. 

HAProxy is lightweight and easy to configure, but it does not provide query filtering nor does query analysis to identify the type of statements being requested. It cannot perform a read/write split on a single port. 

Pgpool-II is a middleware that works between PostgreSQL servers and a PostgreSQL database client. It can perform a read/write split on a single port.  Refer to AWS Database Blog [How to set up a single pgpool endpoint for reads and writes with Amazon Aurora PostgreSQL](https://aws.amazon.com/blogs/database/a-single-pgpool-endpoint-for-reads-and-writes-with-amazon-aurora-postgresql).

> **_NOTE:_** These proxy configurations are specific to single Amazon Aurora cluster, but when it comes to [Aurora global database](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html), consists of one primary DB cluster, and multiple read-only secondary DB cluster. This leads to **more complexity** in proxy configuration. 

##  4. Read/Write traffic separation in application layer

The load balancing with JDBC is pretty native, provide with the connection parameters can trigger the load balancing mechanism. We have implemented the same in our solution. Let us try Read/Write traffic separation using Spring transactional layer.

Spring provides a variation of DataSource, called AbstractRoutingDatasource. It can be used in place of standard DataSource implementations and enables a mechanism to determine which concrete DataSource to use for each operation at runtime. All you need to do is to extend it and to provide an implementation of an abstract determineCurrentLookupKey method. This is the place to implement your custom logic to determine the concrete DataSource. 

Refer to [Technical Article](https://blogs.sap.com/2021/11/10/working-with-multiple-cds-data-stores-in-cap-ng-java/) for Working with multiple CDS Data Stores in CAP NG Java.