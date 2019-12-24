package com.test.greetingsservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/greetings")
public class GreetingsController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>( "Hello world", HttpStatus.OK);
    }

    @GetMapping (value = "", params = {"username"})
    public ResponseEntity<String> sayHelloToUser(@RequestParam String username){
        return new ResponseEntity<>("Hello, " + username, HttpStatus.OK);
    }
}
