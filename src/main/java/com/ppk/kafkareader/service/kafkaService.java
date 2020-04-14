package com.ppk.kafkareader.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaService {
    @KafkaListener(topics = "first_topic")
    public void readPayload(String payload){
        System.out.println(payload);
    }
}
