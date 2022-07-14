# Setup Amazon Aurora Global Database Cluster

### You will learn
  - How to set up Amazon Aurora Global Database Cluster
  
> ### Prerequisites
> - AWS subscription


## Create an Amazon Aurora Instance
To create your first instance of `Amazon Aurora Global Database Cluster`, you need to follow these steps:
If you already have an Amazon Aurora Cluster, you can also do an inplace upgrade adding a new region. but in our scenario, we are going to create a brand-new cluster

1. Open Amazon RDS Management console and select databases then click on create database.
   
   ![AWS](./images/01.png)

2. Select the database creation method as `Standard Create` and Engine options as `Amazon Aurora`,
 then Edition as `Amazon Aurora PostgreSQL-Compatible Edition`              
    ![AWS1](./images/02.png)

    **Note**: Currently Amazon Aurora [multi-master](https://aws.amazon.com/about-aws/whats-new/2019/08/amazon-aurora-multimaster-now-generally-available) replication feature is available on MySQL-Compatible Edition, but the CAP applications does not support MySQL ([Database Support in Java](https://cap.cloud.sap/docs/java/development/#database-support)) so we have to go with PostgreSQL. 
    
3. Then choose the latest PostgreSQL Version. On the righthand side you will see the different versions compatible with Global Database. We are good there with the version selected.

    ![AWS3](./images/03.png)

4. Change the database cluster name to `demo-region-1`, so that we can easily identify which region is primary and secondary. Then add the database credentials.
**Note**: Global Databbase spans multiple regions, it is important that when you are creating a primary region make sure you are in appropriate region. (Top right-hand corner we are in North Virginia Region).
    ![AWS4](./images/04.png)

5. In Availability & Durability section select *Don't Create an Amazon Aurora Replica*. We will create read replica later in different region
   
    ![AWS4](./images/04a.png)

6. Scroll down connectivity section and make sure `Publicly accessible` option is enabled, else some versions not possible to change later. This leads to connectivity issues.
    ![AWS5.1](./images/05-1.png)
  
7. Keep other sections default and move down to Additional Configurations. Then set the initial database name and remove the Enable deletion protection.
    ![AWS5](./images/05.png)

8. Finally click on create database. It takes some time to complete. 

    ![AWS6](./images/06.png)
9.  Finally you could see the demo-region-1 available with read and write endpoints.
   
    ![AWS7](./images/07.png)

**Creating DB cluster with cross-region read replicas**

10.  To create DB cluster, select the Regional cluster and select on actions and then add AWS Region
    ![AWS7](./images/07a.png)

11. Specify the Global database settings and AWS region
    ![AWS7](./images/07b.png)

12. Scroll down connectivity section and make sure Publicly accessible option is enabled
 ![AWS7](./images/07c.png)

12. Keep other sections default and move down to Additional Configurations. Then modify the instance and Cluster Identifier
    ![AWS7](./images/07d.png)

13. Finally click on create database and check the endpoints
    ![AWS7](./images/07e.png)

## Managing Replicas

Using the Amazon RDS console, you can quickly access the status of your DB cluster and respond to Amazon Aurora recommendations.

 ![Aurora manage](./images/08.png)

On very rare occasions, your Amazon Aurora Global Database might experience an unexpected outage in its primary AWS Region. If this happens, your primary Amazon Aurora DB cluster and its writer node aren't available, and the replication between the primary cluster and the secondaries ceases. To minimize both downtime (RTO) and data loss (RPO), you can work quickly to perform a cross-region failover and reconstruct your Amazon Aurora Global Database

To start the MANUAL failover process on your Amazon Aurora Global Database, Choose Fail over Global Database from Actions menu and Choose the secondary Amazon Aurora DB cluster that you want to promote to primary.

![AWS Failover](./images/08a.png)

## Testing the connection

Connection to an Amazon Aurora Global Database depends on whether you need to write to the database or read from the database. 

For read-only requests, you connect to the reader endpoint and DML or DDL statements connect to the cluster endpoint for the primary cluster.

There are different ways to check the DB connection. Make sure connections are working in **both the regions**.

**Using Powershell :**
```
Test-NetConnection -ComputerName demo-region-1.cluster-ro-----------.us-east-1.rds.amazonaws.com -Port 5432
```

**Using DBeaver :** [Download](https://dbeaver.io/download/) and install the community edition of DBeaver and connect to different regions.

![AWSE](./images/E00.png)


In-case of connectivity issues, check the `Publicly accessible` option enabled and VPC Security Groups inbound routes.
![AWSE](./images/E01.png)

![AWSE](./images/05-2.png)

**Monitor the Global Database**

Access the Amazon RDS console and Monitor the Global Database ( [more details](https://awsauroralabsmy.com/global/monitor/) ). 
    ![DB](./images/06.png)

Now you have an Amazon Aurora PostgreSQL-Compatible Edition with Global Database configured. In the next tutorial, learn about developing resilient CAP Application to access your database instance.
