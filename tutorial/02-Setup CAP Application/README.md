# Setup CAP Java project to different regions of SAP Business Technology Platform

### You will learn
 - How to design a resilent CAP application architecture for Amazon Aurora Global Database
 - How to deply the bookshop sample application to different regions of the SAP Business Technology Platform


> ### Prerequisites
> - Make sure you have set up a development environment (that means, you’ve set up SAP Business Application Studio for Development) [as described here](https://developers.sap.com/tutorials/appstudio-onboarding.html).
> - Go to your [SAP BTP Cockpit](https://cockpit.eu10.hana.ondemand.com/) and make sure that you have two subaccounts in your global account. In this case, we have both of them on Azure - one in Asia Pacific (AP10), one in US (US10). If you don't have them yet, click on `New Subaccount` in order to create a new subaccount.

>
>   NOTE: If you already have two subaccounts in different regions, you don't necessarily need to create separate accounts for this tutorial. You can simply reuse the existing ones, if you want. These regions can be from same or different hyperscalers.

## Clone and Test
Clone an existing CAP application in SAP Business Application Studio and deploy it to SAP BTP, Cloud Foundry Runtime.

1. Go to https://github.com/SAP-samples/cloud-cap-samples-java.git and fork the repository. So that you have a dedicated fork on github.com. In one of the subsequent steps you can connect your fork with the SAP Continuous Integration and Delivery service to run certain pipelines.
![Fork Repo](./images/fork-repo.png)
2. Choose your user as destination for the fork. 

    You should now have the repository: github.com/Your User/cloud-cap-samples-java.git.

3.  In SAP Business Application Studio, click on view and find command, then search and select for git clone.
   ![New subaccount](./images/02.png)

4. Specify the previously forked git repository and select the location as Projects. 
    
    Repo: https://github.com/Your User/cloud-cap-samples-java.git

    ![clone](./images/03.png)

5. Build and run the application in SAP SAP Business Application Studio using following command. 
    ```
    mvn spring-boot:run
    ```
   ![Run](./images/04.png)

6. Click `Open in a New Tab` to open the differernt cds-services and UI endpoints.
   
    ![test](./images/05.png)

7. Then click on `Fiori UI` and use the following mock users for testing 
    - User: `user`, password: `user` to browse books
    - User: `admin`, password: `admin` to manage books and orders

## Deploy to SAP Business Technology Platform
The sample bookshop application comes with two predefined profiles: default and cloud  (see srv/src/main/resources/application.yaml). The default profile specifies to use an in-memory H2 database and deploying the application to Cloud Foundry, the CF Java Buildpack automatically configures the cloud Spring profile. We will modify the cloud Spring profile to work with *Amazon Aurora PostgreSQL-Compatible Edition*

8. Use the SAP Business Application Studio Terminal and login to the subaccount.
   
    ```
    cf login -a https://api.cf.ap20.hana.ondemand.com
    ```
**Preparing DB Model deployment:**

9. Execute the following command to create a User-Provided service, utilizing the Amazon Aurora endpoint configuration details.
![endpoint url](./images/07.png)
    ```
    cf create-user-provided-service <service name> -p '{\"dbname\": \"<dbname>\",\"hostname\": \"<db host>\",\"password\": \"<password>\",\"port\": \"<db port>\",\"schema\": \"public\",\"username\": \"<db user>\"}'

    Example:
    cf create-user-provided-service bookshop-pg -p '{\"dbname\": \"postgres\",\"hostname\": \"database-1-instance-1.cs1lgzxhfizd.eu-north-1.rds.amazonaws.com\",\"password\": \"<password>\",\"port\": \"5432\",\"schema\": \"public\",\"username\": \"postgres\"}'
    ```
7.  We are going to use the npm package @cap-js/postgres for deployment.
Add the database details to project descriptor file (package.json). 
    ```
    "dependencies": {
        "@cap-js/postgres": "^1.1.0",
        "@sap/cds-dk": "^7.0.3"
    },
    "scripts": {
        "deploy": "cds-deploy"
    },
    "cds": {
        "build": {
        "target": ".",
        "tasks": [
                    {"for": "nodejs",src": "db","options": {"model": ["db","srv"]}},
                    {"for": "java","src": "srv","options": {"model": ["db","srv"]}}
            ]
        },
        "requires": {
        "db": {
            "kind": "postgres",
            "impl": "@cap-js/postgres",
            "pool": {
            "acquireTimeoutMillis": 3000
            },
            "vcap": {
            "label": "user-provided"
            }
        }
        }
    },
    ```
    In the package.json, we have introduced several modifications. Let’s examine them individually:

    - `` scripts.deploy ``: The hyphen in “cds-deploy” is essential because we do not utilize “@cds-dk” for deployment. In case you are interested in using “@cds-dk” for other reasons, you may consider incorporating the apt-buildpack in your deployment module.
    - `` cds.build``: There are two build tasks to facilitate a Cloud Foundry deployment. One task is for Node.js, and the other is for Java. This approach empowers us to handle database schema deployment using Node.js while executing the application through Spring Boot.
    - `` requires.db.pool.acquireTimeoutMillis``: This parameter determines the duration allowed for waiting until an existing connection is retrieved from the pool or a new connection is established. By default, this value is set to 1000 milliseconds. If the database connection is taking longer than expected, you can increase this parameter to allow for a longer waiting time.
    - `` requires.db.vcap.label`` : If a service is bound to your application and carries the label “postgresql-db,” it is automatically chosen as the default option. This feature is particularly valuable in cases where user-defined services are used. As we are currently utilizing a user-provided service, please retain the value as “user-provided”.

    Now, after enhancing the package.json, we have the ability to manually initiate the build by executing the cds build command, which will generate files and folders ready for deployment. However, note that executing this step right now is not mandatory as it will happen automatically during the mta build stage The next step is to proceed with the final preparation by creating the mta.yml file for deployment.
  
**Deploying Router,Backend and DB deployer Modules:** 

10. Rename the mta-single-tenant.yaml to mta.yaml.  
10. Modify the DB MODULE - bookshop-db  with the following 
    ```
    - name: pg-db-deployer
        type: nodejs
        path: .
        parameters:
        buildpack: nodejs_buildpack
        stack: cflinuxfs4
        no-route: true
        no-start: true
        disk-quota: 2GB
        memory: 512MB
        tasks:
        - name: deploy
            command: npm run deploy
            disk-quota: 2GB
            memory: 512MB
        build-parameters:
        builder: npm-ci
        before-all:
                custom: 
                - npm install --production
                - npx cds build --production​
        ignore: ["node_modules/", "mta_archives/","tmp/","srv/target/"]
        requires:
        - name: bookshop-pg   
    ```
   
11.  Also modify the application.yaml file ([reference](./cloud-cap-samples-java/application.yaml)) for Amazon Aurora PostgreSQL-Compatible Edition data source.    
        ```
        ---
        spring:
        config.activate.on-profile: cloud
        datasource:
            driver-class-name: org.postgresql.Driver
            url: jdbc:postgresql://${vcap.services.bookshop-pg.credentials.hostname}:${vcap.services.bookshop-pg.credentials.port}/${vcap.services.bookshop-pg.credentials.dbname}
            username: ${vcap.services.bookshop-pg.credentials.username}
            password: ${vcap.services.bookshop-pg.credentials.password} 
            initialization-mode: never
            hikari:
                maximum-pool-size: 10
        ```
        **Note**: Replace “bookshop-pg” with the name of your actual database instance specified in the mta.yaml file:

9. Add the PostgreSQL dependency in srv\pom.xml([reference] (./cloud-cap-samples-java/pom.xml)) 
    ````
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <version>42.3.3</version>
    </dependency>
    ````

12. To make use of Amazon Aurora PostgreSQL fast failover, your application's connection string should have a list of hosts instead of just a single host. 
Copy the Amazon Aurora PostgreSQL Endpoint URLs from different regions and create a user provided service for each region then configure the profile something like following ([reference](./cloud-cap-samples-java/application-faf.yaml))

    ```
    jdbc:postgresql://${vcap.services.bookshop-pg-1.credentials.hostname}:${vcap.services.bookshop-pg-1.credentials.port},${vcap.services.bookshop-pg-2.credentials.hostname}:${vcap.services.bookshop-pg-2.credentials.port}/bookshop?currentSchema=public&loginTimeout=2&connectTimeout=2&cancelSignalTimeout=2&socketTimeout=60&tcpKeepAlive=true&targetServerType=primary
    ```
    **Note:** 
    - targetServerType - allows opening connections to only servers with required state/role in accordance to the defining factor for the PostgreSQL servers. The allowed values are any, primary, secondary, preferSlave, and preferSecondary.  State or role is determined by observing if the server allows writes or not.      


13. Right click on mta.yaml file and Build the application.
    ![deploy](./images/06.png)

14.  Deploy the mtar to SAP Business Technology Platform subaccount.
    ![deploy1](./images/10.png)
 
15. Repeat the step 14 for other subaccounts.
    
> Refer the [CI/CD pipeline](../../../Operational%20Resiliency/CICD/README.md) that automatically builds, tests, and deploys your code changes. Also refer [Cloud Transport Management Service](../../../Operational%20Resiliency/TMS/README.md) for propagate it towards different regions.

Congratulations! Now you have a sample bookshop application running on subaccounts of different regions and connecting to Amazon Aurora PostgreSQL-Compatible Edition. In the next tutorial, learn about mapping custom domain routes for this application.