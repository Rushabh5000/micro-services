package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("first")
public class FirstRest {
	@GetMapping("/test")
	public ResponseEntity<Object> greet(){
		return ResponseEntity.status(200).body("Hello 1st Microservices");
	}
}
