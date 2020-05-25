package com.cyq.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyq.web.service.IHelloService;

@RestController
public class HelloController {
	
	@Autowired
	private IHelloService helloService;
	
	@GetMapping("/hello")
	public Object hello() {
		return "hello world";
	}
	
	@GetMapping("/helloByFeign")
	public Object helloByFeign() {
		return helloService.hello();
	}

}
