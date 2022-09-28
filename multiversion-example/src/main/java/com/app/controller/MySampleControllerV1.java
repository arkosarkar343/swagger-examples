package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MySampleControllerV1 {

	@GetMapping(path = "/hello")
	public String sayHello(@RequestParam String name) {
		return "Hello "+name;
	}
}
