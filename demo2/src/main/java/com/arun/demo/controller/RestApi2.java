package com.arun.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi2
{

	@GetMapping("/demo2")
	private String fun() {
		// TODO Auto-generated method stub
			return "Hi i'm from demo 2";
	}
	
	@GetMapping("/open-feign")
	private String feign() {
		// TODO Auto-generated method stub
			return "i'm feignboy";
	}
	
	@GetMapping("/fallback")
	private String fallback() {
		// TODO Auto-generated method stub
			return "I'm fallback";
	}
}
