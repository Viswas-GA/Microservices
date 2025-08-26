package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.AppConfig;

@RestController
public class OrderController {
    private final AppConfig config;

    public OrderController(AppConfig config) {
        this.config = config;
    }

    @GetMapping("/order/info")
    public String getOrderInfo() {
        return String.format("Name: %s, Version: %s, Developer: %s",
            config.getName(), config.getVersion(), config.getDeveloper());
    }
}
