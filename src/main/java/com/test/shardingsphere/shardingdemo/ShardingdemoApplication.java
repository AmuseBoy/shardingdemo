package com.test.shardingsphere.shardingdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.test.shardingsphere.shardingdemo.dao")
public class ShardingdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingdemoApplication.class, args);
    }

}
