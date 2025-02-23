package com.darc.dependencyinjection.controllers;

import com.darc.dependencyinjection.services.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService greetingService;

    ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
