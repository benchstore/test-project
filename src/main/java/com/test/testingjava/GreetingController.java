package com.test.testingjava;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return new ResponseEntity<>("Hello world", HttpStatus.OK);
    }
}
