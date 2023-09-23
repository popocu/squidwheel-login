package com.squidwheels.login.api.controller;

import com.squidwheels.login.api.HealthCheckApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController implements HealthCheckApi {

    private static final String HEALTHY_STATUS = "Y";
    private static final String UNHEALTHY_STATUS = "N";

    @Override
    public ResponseEntity<String> healthCheck() throws Exception {
        return new ResponseEntity<>(HEALTHY_STATUS, HttpStatus.OK);
    }
}
