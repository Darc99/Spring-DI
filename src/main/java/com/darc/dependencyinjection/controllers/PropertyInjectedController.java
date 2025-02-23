package com.darc.dependencyinjection.controllers;

import com.darc.dependencyinjection.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {

        return greetingService.sayGreeting();
    }
}
