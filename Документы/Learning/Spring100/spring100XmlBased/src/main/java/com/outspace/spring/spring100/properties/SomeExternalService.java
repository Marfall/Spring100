package com.outspace.spring.spring100.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SomeExternalService {

    // from property file external.service.url
    @Value("${external.service.url}")
    private String url;

    public String returnServiceURL() {
        return url;
    }
}
