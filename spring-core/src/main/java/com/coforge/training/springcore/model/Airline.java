package com.coforge.training.springcore.model;

/**
* Author	:Shozaib.Zulfiqar
* Date		:Sep 26, 2025
* Time 		:4:44:16 PM
* Project 	:com.coforge.training.springcore.model
*/

public class Airline {

	private String name;
	private int code;
	private String country;
	
	public Airline(String name, int code, String country) {
		super();
		this.name = name;
		this.code = code;
		this.country = country;
	}



	public void display() {
		System.out.println(this.name+" "+this.code+" "+this.country);
	}


}
