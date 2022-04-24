package com.example.springboot;

import com.example.servcies.EvenOrOddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	//@Autowired(required = true)
	private EvenOrOddService evenOrOddService;

	@GetMapping("/hello")
	public String index() {
		return "Yes, the Magic Spring Boot! is working";
	}

	@GetMapping("/validate/{num}")
	public Object checkEvenrOdd(@RequestParam(value = "num") Integer num){
		System.out.println("checkEvenOrOdd Initiated :: " + num);
		return evenOrOddService.checkEvenOrOdd(num);

	}
}
