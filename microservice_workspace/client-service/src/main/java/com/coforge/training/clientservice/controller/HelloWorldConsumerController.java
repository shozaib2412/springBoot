package com.coforge.training.clientservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.helloservice.model.Employee;

@RestController
public class HelloWorldConsumerController {
	
	private final HelloClient helloClient;

	//DI using Constructors
	public HelloWorldConsumerController(HelloClient helloClient) {
		super();
		this.helloClient = helloClient;
	}
	
//	open postman browser - http://localhost:8091/get-hello
	@GetMapping("/get-hello")
	public String getMethodName() {
		return helloClient.getHello();
	}
	
	@GetMapping("/test")
	public String getMethodName1() {
		return helloClient.myMethod();
	}

	@GetMapping("/get-employees")
	public List<Employee> getEmployees() {
		return helloClient.getEmployees();
	}



}
