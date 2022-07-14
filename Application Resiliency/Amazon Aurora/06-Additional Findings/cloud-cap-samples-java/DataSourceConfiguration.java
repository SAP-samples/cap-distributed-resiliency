package my.bookshop.config;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariDataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

@Configuration
public class DataSourceConfiguration {
    private final ThreadLocal<String> currentTenant = new ThreadLocal<>();

    
    //Fetching the DB ConfigurationProperties from application.yaml
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    @Primary
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
                //return currentTenant.get();
                return "S";
            }
        };
        Map<Object, Object> dataSourceMap = new ConcurrentHashMap<>();
        dataSourceMap.put("P", primaryDataSourceProperties.initializeDataSourceBuilder().type(HikariDataSource.class).build());
        dataSourceMap.put("S", secondaryDataSourceProperties.initializeDataSourceBuilder().type(HikariDataSource.class).build());
        routingDataSource.setTargetDataSources(dataSourceMap);
        routingDataSource.setDefaultTargetDataSource(dataSourceMap.get("P"));
        routingDataSource.afterPropertiesSet();
        return routingDataSource;
    }
}
