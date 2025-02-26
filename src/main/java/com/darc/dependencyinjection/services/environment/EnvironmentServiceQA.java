package com.darc.dependencyinjection.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class EnvironmentServiceQA implements EnvironmentService {

    @Override
    public String getLocation() {
        return "qa";
    }
}
