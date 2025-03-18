package com.example.spring_server_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	@GetMapping("/")
	public String home() {
		return "Test Good, World!";
	}
}
