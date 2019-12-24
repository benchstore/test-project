package com.test.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api")
public class ApiController {

    @GetMapping
    public String[] getAPIs() {
        return new String[] {"API list"};
    }
}
