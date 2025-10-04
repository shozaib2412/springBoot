package com.coforge.training.springcore.model;

/**
 * Author	:Shozaib.Zulfiqar
 * Date		:Sep 27, 2025
 * Time 		:10:39:00 AM
 * Project 	:com.coforge.training.springcore.model
 */

//Bean class with dependent Object of type Address - Loosely coupled class using XML Configuration
public class Person {


	private int id;
	private String name;
	private Address address; // has-a relationship - Address Object

	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println("********** Person Information **************");
		System.out.println(this.id+" "+this.name);
		System.out.println(address);//toString() method of Address class
	}



}
