package com.mikolee.eurekaserverlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerLearningApplication.class, args);
    }

}
