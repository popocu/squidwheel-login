package com.squidwheels.login.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface HealthCheckApi {

    @RequestMapping(value = "/healthCheck", method = RequestMethod.GET)
    public ResponseEntity<String> healthCheck() throws Exception;
}
