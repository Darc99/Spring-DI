package com.darc.dependencyinjection.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello From Base Service";
    }
}
