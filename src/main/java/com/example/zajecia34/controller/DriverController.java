package com.example.zajecia34.controller;

import com.example.zajecia34.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DriverController {

    private final DriverService driverService;
}
