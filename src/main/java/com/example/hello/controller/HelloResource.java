package com.example.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
	
	@RequestMapping("/")
	public String HomeFunction() {
		return "Hello World, This is home page";
	}
	
	@RequestMapping("/message")
	public String returnResourceMessage() {
		return "Hello World from Springboot application";
	}
}
