package com.prachi.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class IntegrationRestController {

	@GetMapping("/welcome")
	
	public String getWelcomeMsg(){
		return "Welcome !!! Hiii My name is Prachiiiii";
	}
	@GetMapping("/greet")
	
	public String getGreetMsg() {
		return "Hey, there how are you???";
	}
}
