package com.test.aggregationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/answers")
public class AggregationController {

    @GetMapping
    public String[] getAnswer() {
        return new String[] {"ANSWER"};
    }
}
