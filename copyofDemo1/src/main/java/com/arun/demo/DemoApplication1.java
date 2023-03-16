package com.arun.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoApplication1 { 

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication1.class, args);
	}

}
