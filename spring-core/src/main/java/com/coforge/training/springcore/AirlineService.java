package com.coforge.training.springcore;

import org.springframework.stereotype.Component;

import com.coforge.training.springcore.model.Airline;

/**
* Author	:Shozaib.Zulfiqar
* Date		:Sep 26, 2025
* Time 		:4:52:05 PM
* Project 	:com.coforge.training.springcore
* 
* 
* Service class to provide airline object with some hardcoded values for demonstration purpose
* 
* @Component annotation is used to mark this class as a Spring component.
* This allows Spring to automatically detect and register it as a bean
* in the application context during component scanning.
* This is essential for enabling dependency injection and managing the lifecycle of the bean. 
*/

@Component
public class AirlineService {

	
	public Airline getSampleAirline() {
		return new Airline("AirIndia", 101, "India");
	}
	
	public Airline getSampleAirline1() {
		return new Airline("SingaPureee Airlines", 69, "Australia");
	}
}
