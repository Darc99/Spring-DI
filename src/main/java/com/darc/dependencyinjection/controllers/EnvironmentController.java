package com.darc.dependencyinjection.controllers;

import com.darc.dependencyinjection.services.environment.EnvironmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;


    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String sayLocation() {
        return environmentService.getLocation();
    }
}
