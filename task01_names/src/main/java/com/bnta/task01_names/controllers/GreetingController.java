package com.bnta.task01_names.controllers;

import com.bnta.task01_names.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting") //localhost:8080/greeting
public class GreetingController {

    @GetMapping// GET localhost:8080/greeting
    public Greeting newGreeting(@RequestParam (defaultValue = "") String name,@RequestParam (defaultValue = "") String timeOfDay){
        return new Greeting(name, timeOfDay);
    }

}
