package com.uber.driver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uber.driver.service.DriverService;

@RestController
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    private DriverService service;

    @GetMapping("/")
    public void getDriverLocation() throws InterruptedException {
        String location = service.getLocation();
        System.out.println(location);
    }

}
