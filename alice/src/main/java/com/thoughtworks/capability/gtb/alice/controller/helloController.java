package com.thoughtworks.capability.gtb.alice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class helloController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping(value = "/hello")
    public String hello(){
        return restTemplate.getForObject("http://bob:8081/hello", String.class);
    }

}

