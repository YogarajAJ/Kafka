package com.kafka.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	@KafkaListener(topics="my-profile")
	public void consume(String message) {
		System.out.println(" - Consumer : Inside Consume Message -"+message);
	}
}
