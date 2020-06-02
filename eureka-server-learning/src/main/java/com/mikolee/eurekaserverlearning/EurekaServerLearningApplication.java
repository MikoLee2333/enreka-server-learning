package com.mikolee.eurekaserverlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
//@RestController
public class EurekaServerLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerLearningApplication.class, args);
    }
//    @RequestMapping(value = "/")
//    public String home(){
//        return "Eureka Client application";
//    }

}
