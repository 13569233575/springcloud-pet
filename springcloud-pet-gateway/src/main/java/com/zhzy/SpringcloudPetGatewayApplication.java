package com.zhzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy // zuul 服务
public class SpringcloudPetGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudPetGatewayApplication.class, args);
    }

}
