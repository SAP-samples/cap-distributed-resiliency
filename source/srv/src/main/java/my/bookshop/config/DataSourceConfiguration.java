package my.bookshop.config;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariDataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

@Configuration
public class DataSourceConfiguration {

    
    //Fetching the DB ConfigurationProperties from application.yaml
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    public DataSourceProperties primaryDataSourceProperties()
    {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.secondary")
    public DataSourceProperties secondaryDataSourceProperties()
    {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    public DataSource routingDataSource(DataSourceProperties primaryDataSourceProperties,DataSourceProperties secondaryDataSourceProperties)
    {         
        AbstractRoutingDataSource routingDataSource =  new AbstractRoutingDataSource() {
            @Override
            protected Object determineCurrentLookupKey() {
                //return DatabaseContextHolder.get();
                String temp = getReadEndPointRegion();
                return temp;
            }
        };
        Map<Object, Object> dataSourceMap = new ConcurrentHashMap<>();
        dataSourceMap.put("primary", primaryDataSourceProperties.initializeDataSourceBuilder().type(HikariDataSource.class).build());
        dataSourceMap.put("secondary", secondaryDataSourceProperties.initializeDataSourceBuilder().type(HikariDataSource.class).build());
        routingDataSource.setTargetDataSources(dataSourceMap);
        routingDataSource.setDefaultTargetDataSource(dataSourceMap.get("primary"));
        routingDataSource.afterPropertiesSet();
        return routingDataSource;
    }
    public String getReadEndPointRegion() {
        RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
        return (String) requestAttributes.getAttribute("readEndPointRegion", RequestAttributes.SCOPE_REQUEST);
    }
}
