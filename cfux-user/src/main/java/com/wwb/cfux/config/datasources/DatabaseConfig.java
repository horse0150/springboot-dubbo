package com.wwb.cfux.config.datasources;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DatabaseConfig {

    @Primary
    @Bean("firstDataSource")
    @ConfigurationProperties("spring.datasource.druid.first")
    public DataSource firstDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean("secondDataSource")
    @ConfigurationProperties("spring.datasource.druid.second")
    public DataSource secondDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    public DynamicDatasource dynamicDatasource(DataSource firstDataSource, DataSource secondDataSource){
        Map<String,DataSource> map = new HashMap<>(2);
        map.put(DataSourceNames.FIRST,firstDataSource);
        map.put(DataSourceNames.SECOND,secondDataSource);
        return new DynamicDatasource(firstDataSource,map);
    }
}
