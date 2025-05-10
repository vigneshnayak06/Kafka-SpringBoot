package com.uber.customer.customer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerLocation {
    
    @KafkaListener(topics="topic-location", groupId="user-group")
    public void receiveLocationUpdates(String location) {
        System.out.println(location);
    }

}
