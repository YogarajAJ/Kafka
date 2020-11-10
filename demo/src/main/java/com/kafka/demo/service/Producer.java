package com.kafka.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	private static final String TOPIC = "my-profile";
	
	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;
	
	public void sendMessage(String message) {
		System.out.println(" - Producer : Inside Send Message -");
		this.kafkaTemplate.send(TOPIC, message);
	}
}
