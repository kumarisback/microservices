package com.arun.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
@Configuration
public class ApiApplication {

	@Autowired
	ConfigClient c;
	
//	 @Bean
//	    public Sampler defaultSampler() {
//	        return Sampler.ALWAYS_SAMPLE;
//	    }

	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
	    return builder.routes().route(p -> p
	            .path("/demo1/**")
	            .filters(f -> f.addRequestHeader("Hello", "World"))
	            .uri("lb://demo"))
//	    		.route(p -> p
//	    	            .path("/demo2")
//	    	            .filters(f -> f.addRequestHeader("Hello2", "World2"))
//	    	            .uri("http://localhost:8082/"))
	    		.route(p -> p
	    	            .path("/demo2")
	    	            .filters(f -> f.circuitBreaker(c->c.setName("breaker").setFallbackUri("forward:/fallback")).modifyResponseBody(String.class, String.class,
	    	                    (exchange, s) -> Mono.just(s.toUpperCase()+"i'm added to you")))
	    	            .uri("http://localhost:8082"))
	        .build();
	}
	
	@GetMapping("/fallback")
	public String fallback() {
		
		
	  return "fallback"+ c.getValue();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
