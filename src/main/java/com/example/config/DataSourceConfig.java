package com.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
    // 将Druid 数据源覆盖已有的DataSource数据源对象
    @Bean
    // 将配置文件中前缀为spring.datasource的属性值 注入到 实例对象的成员变量
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource getDruid(){
        DruidDataSource duridDataSource=new DruidDataSource();
        //duridDataSource.setMaxActive(20);
        return duridDataSource;
    }
}
