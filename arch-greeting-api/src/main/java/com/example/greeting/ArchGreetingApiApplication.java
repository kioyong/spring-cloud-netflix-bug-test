package com.example.greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ArchGreetingApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchGreetingApiApplication.class, args);
    }

}

