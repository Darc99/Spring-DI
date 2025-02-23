package com.darc.dependencyinjection.controllers;

import com.darc.dependencyinjection.services.GreetingService;
import com.darc.dependencyinjection.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {

        System.out.println("I am in the controller");
        return "hello";
    }
}
