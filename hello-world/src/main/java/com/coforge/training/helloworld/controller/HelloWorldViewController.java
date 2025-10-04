package com.coforge.training.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
* Author	:Shozaib.Zulfiqar
* Date		:Sep 29, 2025
* Time 		:3:09:27 PM
* Project 	:com.coforge.training.helloworld.controller
*/

@Controller
public class HelloWorldViewController {

	
	@GetMapping("/shozaib")
	public String getMethodName(Model m) {
		
		m.addAttribute("name" , "Shozaib Zulfiqar");
		m.addAttribute("city" , "Mumbai");
		m.addAttribute("country" , "India");
		m.addAttribute("hello" , "Hello From spring boot using JSP Views");
		
		
		return "welcome";
	}
}
