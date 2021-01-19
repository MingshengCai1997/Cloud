package com.sheng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.io.Serializable;

@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 implements Serializable {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
