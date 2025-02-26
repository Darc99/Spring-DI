package com.darc.dependencyinjection.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class EnvironmentServiceDev implements EnvironmentService {

    @Override
    public String getLocation() {
        return "Dev";
    }
}
