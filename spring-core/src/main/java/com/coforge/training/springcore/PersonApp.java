package com.coforge.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springcore.model.Person;

/**
* Author	:Shozaib.Zulfiqar
* Date		:Sep 27, 2025
* Time 		:10:46:41 AM
* Project 	:com.coforge.training.springcore
*/

public class PersonApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("PersonConfig.xml");
		
		Person p1 =(Person) context.getBean("person1");
		p1.display();
		
		Person p2 =(Person) context.getBean("person2");
		p2.display();
		
		Person p3 =(Person) context.getBean("person3");
		p3.display();
	}

}
