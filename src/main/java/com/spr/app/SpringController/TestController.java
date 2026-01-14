package com.spr.app.SpringController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("test")
public class TestController {

	@GetMapping("hello")
	public String sayHello() {
		System.out.println("Request arrived to say hello!");
		return "Hi there, This is a test hello call.";
	}
 
}
