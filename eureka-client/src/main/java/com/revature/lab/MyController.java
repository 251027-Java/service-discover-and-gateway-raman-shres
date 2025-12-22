package com.revature.lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MyController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello from Eureka Client A";
	}
}

