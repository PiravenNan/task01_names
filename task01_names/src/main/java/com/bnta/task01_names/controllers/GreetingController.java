package com.bnta.task01_names.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting") //localhost:8080/greeting
public class GreetingController {

    @GetMapping // GET localhost:8080/greeting

    public String newGreeting(){
        return "Hello";
    }

}
