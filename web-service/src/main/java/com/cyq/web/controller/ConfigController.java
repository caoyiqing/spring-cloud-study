package com.cyq.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	
	@Value("${person.name}")
	String name;
	
	@Value("${person.age}")
	Integer age;
	
	@GetMapping("/getPersonInfo")
	public Object getPersonInfo() {
		return "person name is " + name + " age is " + age;
	}

}
