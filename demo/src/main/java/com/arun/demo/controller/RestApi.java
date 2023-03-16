package com.arun.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

	@Autowired
	Openfeignexample o;
	
	@GetMapping("/demo1/home")
	private String fun() {
		// TODO Auto-generated method stub
			return "Hi i'm from demo 1 Home";
	}
	
	@GetMapping("/demo1")
	private String fun2() {
		// TODO Auto-generated method stub
		String val=o.getval();
//			return "Hi i'm from demo 1"+"---"+val;
		return "I'm from demo 1 bro";
	}
}
