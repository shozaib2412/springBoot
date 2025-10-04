package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.coforge.training.springweb.model.User;

/**
* Author	:Shozaib.Zulfiqar
* Date		:Sep 27, 2025
* Time 		:3:47:49 PM
* Project 	:com.coforge.training.springweb.controller
*/


@Controller
public class RegistrationController {

	// Load Registration Form 
	
	@GetMapping("/userRegistration")
	public String showRegisterForm(Model theModel) {
		
		theModel.addAttribute("user" , new User());
		
		return "userRegistration";
	}
	
	// Submit Registration Form 
	@PostMapping("/saveUser")
	public String submitForm(@ModelAttribute("user") User user , Model model) {
		
		model.addAttribute("user" , user);       // pass user to the success Page
		
		return "success";
	}
	
	// View Registration details 
}
