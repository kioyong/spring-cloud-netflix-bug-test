package com.example.greeting.controller;

import com.example.greeting.clients.GreetingClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/greeting")
@AllArgsConstructor
public class GreetingController {


    private final GreetingClient client;

    @GetMapping
    public String hello() {
        return client.hello();
    }


}
