package com.zhzy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //eureka 客户端 注解
@EnableDiscoveryClient
@MapperScan("com.zhzy.mapper")
@EnableCircuitBreaker // hystrix
public class SpringcloudPetProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudPetProductApplication.class, args);
    }

}
