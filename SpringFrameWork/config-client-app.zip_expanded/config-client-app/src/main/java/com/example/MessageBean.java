package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageBean {
	
	@Value("${user.message}")
	private String message;

	
	public String getMessage() {
		return message;
	}
	

}
