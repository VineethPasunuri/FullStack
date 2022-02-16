package com.legatohealth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.legatohealth.client.Client;
import com.legatohealth.service.MyService;


@RestController
@RequestMapping("myclient")
public class ServiceClientController {
	
	@Autowired
	private MyService service;

//	@Autowired
//	private RestTemplate restTemplate;
//	
//	@Autowired
//	private Client client;
//
//	@GetMapping("one")
//	private ResponseEntity<Object> callFirstApp() {
//		String url = "http://FIRSTAPP/myfirstapp";
//		String data = restTemplate.getForObject(url, String.class);
//		return ResponseEntity.status(200).body("Second App Calling : " + data);
//	}
//	@GetMapping("onemoretime")
//	private ResponseEntity<Object> callFirstAgain(){
//		String data = client.invokeFirstApp();
//		return ResponseEntity.status(200).body("Second App Called through Feign : "+data);
//	}
	
	@GetMapping("onemoretime")
	private ResponseEntity<Object> callFirstAgain(){
		String data = service.getFirstAppData();
		return ResponseEntity.status(200).body("Result from Service Client : "+data);
	}

}
