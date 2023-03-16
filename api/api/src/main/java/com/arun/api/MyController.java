//package com.arun.api;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.sleuth.Tracer;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import lombok.extern.slf4j.Slf4j;
//
//@RestController
//@Slf4j
//public class MyController {
//
//    @Autowired
//    private Tracer tracer;
//
//    @GetMapping("/my-endpoint")
//    public ResponseEntity<String> myEndpoint() {
//    	log.info("message");
//    	
//        log.info("Received request for myEndpoint");
//        String traceId = tracer.currentSpan().context().traceId();
//        String spanId = tracer.currentSpan().context().spanId();
//        log.info("Trace ID: {}, Span ID: {}", traceId, spanId);
//        // Your code here
//        return ResponseEntity.ok("Response from myEndpoint");
//    }
//}
