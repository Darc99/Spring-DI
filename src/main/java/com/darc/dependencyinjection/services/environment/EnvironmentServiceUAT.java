package com.darc.dependencyinjection.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class EnvironmentServiceUAT implements EnvironmentService {

    @Override
    public String getLocation() {
        return "uat";
    }
}
