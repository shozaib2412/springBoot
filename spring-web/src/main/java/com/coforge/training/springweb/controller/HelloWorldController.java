package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
* Author	:Shozaib.Zulfiqar
* Date		:Sep 27, 2025
* Time 		:2:30:52 PM
* Project 	:com.coforge.training.springweb.controller
*/

@Controller
public class HelloWorldController {
	
	/* Work Flow of Spring MVC Application
	 * 
	 *   Client --> Request(index.jsp) --> FrontController(Web.xml) 
	 *       -->Controller(HelloWorldController) ---> response(hello.jsp) 
	 * 
	 */
	
	@GetMapping("/shozaib")       // Mapping URL of the request to the method
	public String sayHello() {
		return "hello";    //returns hello.jsp
	}
	
	@GetMapping("/noida")       // Mapping URL of the request to the method
	public String sayHello1() {
		return "noida";    //returns noida.jsp
	}

}
