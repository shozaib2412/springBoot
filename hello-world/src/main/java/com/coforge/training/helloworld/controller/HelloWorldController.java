package com.coforge.training.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.helloworld.model.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



/**
* Author	:Shozaib.Zulfiqar
* Date		:Sep 29, 2025
* Time 		:2:36:11 PM
* Project 	:com.coforge.training.helloworld.controller
*/

@RestController
public class HelloWorldController {

	// Open Browser -- http://localhost:8082/myweb/
	@GetMapping("/")
	public String sayHello() {
		return "Hello World from Spring Boot! 😊😊";
	}
	
	
	// Open Browser -- http://localhost:8082/myweb/test
	@GetMapping("/test")
	public String sayTest() {
		return "She Sells Sea Shell in the Sea. 🎶🐚";
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		
		Employee e1=new Employee(101,"James","Gosling","james@sun.com");
		Employee e2=new Employee(102,"Rod","Jhonson","rod@spring.com");
		Employee e3=new Employee(103,"Gavin","King","king@sun.com");
		Employee e4=new Employee(107,"Shonu","Sing","sing@sonu.com");
		
		List<Employee> empList= new ArrayList<>();
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		return  empList;
	}
	
	
	
}
