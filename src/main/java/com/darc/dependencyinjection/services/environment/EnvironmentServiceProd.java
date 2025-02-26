package com.darc.dependencyinjection.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class EnvironmentServiceProd implements EnvironmentService {

    @Override
    public String getLocation() {
        return "prod";
    }
}
