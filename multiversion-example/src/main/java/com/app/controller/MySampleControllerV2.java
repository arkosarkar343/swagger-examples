package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
public class MySampleControllerV2 {

	@GetMapping(path = "/hello")
	public String sayHello() {
		return "Hello World!";
	}
}
