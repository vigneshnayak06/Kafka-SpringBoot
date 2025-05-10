package com.uber.driver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    @Autowired
    private KafkaTemplate<String, Object> template;

    public String getLocation() throws InterruptedException {

        double randomLat = Math.random();
        double randomLong = Math.random();
        int i = 10;

        while (i > 0) {
            template.send("topic-location", "Location: " + randomLat + " " + randomLong);
            Thread.sleep(1000);
            i--;
        }

        return "Location: " + randomLat + " " + randomLong;
    }

}