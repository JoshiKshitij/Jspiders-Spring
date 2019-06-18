package com.spiders.si;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	
	
	public static void main(String[] args) {
		
		// guy with the power
		// will create the object 
		// at run time
		ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
		
		Computer computer = container.getBean(Computer.class, "com");
		System.out.println(computer);
		
		
		
	}
}
