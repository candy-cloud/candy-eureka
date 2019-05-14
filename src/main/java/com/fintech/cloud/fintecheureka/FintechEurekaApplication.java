package com.fintech.cloud.fintecheureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FintechEurekaApplication {


    public static void main(String[] args) {
        SpringApplication.run(FintechEurekaApplication.class, args);
    }

}
