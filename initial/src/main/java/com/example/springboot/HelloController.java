package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

	@GetMapping("/greeting")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
