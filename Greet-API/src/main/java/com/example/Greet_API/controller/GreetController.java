package com.example.Greet_API.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class GreetController {

    private static final Logger logger = LoggerFactory.getLogger(GreetController.class);

    @GetMapping("/greet")
    public String greetAPI(){
        logger.info("Insede the Greet");
      return  "Running Greet.....";
    }
}
