package com.coforge.training.springcore.model;

/**
 * Author	:Shozaib.Zulfiqar
 * Date		:Sep 27, 2025
 * Time 		:10:22:20 AM
 * Project 	:com.coforge.training.springcore.model
 */

public class Product {
	//	Bean class for setter Injection using Annotation Configuration


	private String name;
	private double price;

	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}




}
