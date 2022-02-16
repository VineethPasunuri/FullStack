package com.legatohealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.legatohealth.client.Client;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class MyService {

	@Autowired
	private Client client;

	@CircuitBreaker(name = "fetchFirstApp", fallbackMethod = "getFirstAppdataAlternate")
	public String getFirstAppData() {
		System.out.println("---Request is going to fallback from the Client---");
		String data = client.invokeFirstApp();
		return data;
	}
	
	public String getFirstAppdataAlternate(Throwable t) {
		System.out.println("---request is not going to FirstApp from Client, It is th fallback method---");
		return "Alternate Response from fallback method";
	}

}
