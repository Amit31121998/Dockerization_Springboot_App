package com.amit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetApp {
	
	@GetMapping("/greet")
	public String appGreet() {
		return "Welcome to hyderabad";
	}

}
