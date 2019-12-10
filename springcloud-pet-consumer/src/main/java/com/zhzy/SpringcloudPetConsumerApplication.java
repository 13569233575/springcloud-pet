package com.zhzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.zhzy.service")
@EnableEurekaClient
public class SpringcloudPetConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudPetConsumerApplication.class, args);
    }

}
