package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.AppConfig;

@RestController
public class UserController {
    private final AppConfig config;

    public UserController(AppConfig config) {
        this.config = config;
    }

    @GetMapping("/user/info")
    public String getUserInfo() {
        return String.format("Name: %s, Version: %s, Developer: %s",
            config.getName(), config.getVersion(), config.getDeveloper());
    }
}
