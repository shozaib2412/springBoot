 package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
* Author	:Shozaib.Zulfiqar
* Date		:Sep 29, 2025
* Time 		:10:28:38 AM
* Project 	:com.coforge.training.springweb.controller
*/


@Controller
public class UserController {
	
	@RequestMapping(value = "/user" , method = RequestMethod.GET)
	public String userInfo(ModelMap model) {
		model.addAttribute("user" , "Rod Johnson");
		model.addAttribute("d" , new java.util.Date() );
		return "user";
	}
	
	@RequestMapping("/spring")
	public String showSecond() {
		return "second";  //returns Views
	}

}
