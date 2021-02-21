package com.test.shardingsphere.shardingdemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;


/**
 * @ClassName DruidConfig
 * @Description TODO
 * @Author 刘培振
 * @Date 2019/3/4 11:10
 * @Version 1.0
 */
@Configuration
public class DruidConfig {

    private Logger logger = LoggerFactory.getLogger(DruidConfig.class);

    @Value("${spring.shardingsphere.datasource.ds0.url}")
    private String dbUrl;

    @Value("${spring.shardingsphere.datasource.ds0.username}")
    private String username;

    @Value("${spring.shardingsphere.datasource.ds0.password}")
    private String password;

    @Value("${spring.shardingsphere.datasource.ds0.driver-class-name}")
    private String driverClassName;

//    @Value("${spring.datasource.initialSize}")
//    private int initialSize;
//
//    @Value("${spring.datasource.minIdle}")
//    private int minIdle;
//
//    @Value("${spring.datasource.maxActive}")
//    private int maxActive;
//
//    @Value("${spring.datasource.maxWait}")
//    private int maxWait;
//
//    @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
//    private int timeBetweenEvictionRunsMillis;
//
//    @Value("${spring.datasource.minEvictableIdleTimeMillis}")
//    private int minEvictableIdleTimeMillis;
//
//    @Value("${spring.datasource.validationQuery}")
//    private String validationQuery;
//
//    @Value("${spring.datasource.testWhileIdle}")
//    private boolean testWhileIdle;
//
//    @Value("${spring.datasource.testOnBorrow}")
//    private boolean testOnBorrow;
//
//    @Value("${spring.datasource.testOnReturn}")
//    private boolean testOnReturn;
//
//    @Value("${spring.datasource.poolPreparedStatements}")
//    private boolean poolPreparedStatements;
//
//    @Value("${spring.datasource.filters}")
//    private String filters;

    @Bean(initMethod = "init",destroyMethod = "close")
    @Primary
    @DependsOn(value = "springShardingDataSource")
    public DruidDataSource druidDataSource(){
        logger.info("开始配置druidDataSource");
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(this.dbUrl);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driverClassName);
        logger.info("druidDataSource配置成功");
        return dataSource;
    }
}
