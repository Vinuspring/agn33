package com.example.agn33.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class Service2Controller
{
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/api/service2")
    public String service2Endpoint() {
        String service1Response = restTemplate.getForObject("http://localhost:8081/api/service1", String.class);
        return "Service-2 calling Service-1: " + service1Response;
    }
}
