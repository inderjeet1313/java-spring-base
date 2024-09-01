package com.example.demo.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Main Controller")
public class MainController {

    @Operation(summary = "Health Check API", description = "An API to check the System Availability")
    @GetMapping(value = "/health-check")
    public ResponseEntity<String> healthCheck() {
        return new ResponseEntity<>("System is up and Running", HttpStatus.OK);
    }


}
