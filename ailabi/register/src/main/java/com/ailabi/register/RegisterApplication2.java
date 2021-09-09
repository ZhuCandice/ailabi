package com.ailabi.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegisterApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(RegisterApplication2.class, args);
    }

}
