package com.coforge.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springcore.model.HelloWorld;

/**
 * Hello world!
 *
 *Spring Application using XML Configuration demonstrating DI
 */
public class HelloWorldApp 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("HelloWorldConfig.xml");
    	
    	HelloWorld obj1 =(HelloWorld) context.getBean("hw1");
    	obj1.getMsg();
    	
    	HelloWorld obj2 =(HelloWorld) context.getBean("hw2");
    	obj2.getMsg();
    	
    	HelloWorld obj3 =(HelloWorld) context.getBean("hw3");
    	obj3.getMsg();
    	
    	System.out.println(obj1.getMsg());
    	System.out.println(obj2.getMsg());
    	System.out.println(obj3.getMsg());
    	
    	
    	((ClassPathXmlApplicationContext) context).close();
    
    }
}
