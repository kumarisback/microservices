package com.arun.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication2.class, args);
	}

}
