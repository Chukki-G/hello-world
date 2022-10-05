package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
@RequestMapping("/")
public String hello() {
	return "Hello World!!!";
}

@GetMapping("/status")
public String deploy() {
	return "Hurray !!! Application deployed to AWS... !!!";
}

}
