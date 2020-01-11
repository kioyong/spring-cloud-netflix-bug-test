package com.example.greeting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Value("${spring.application.name:}")
    private String applicationName;

    @GetMapping
    public String hello() {
        return "Hello Microservice, Message from service: " + applicationName;
    }

}
