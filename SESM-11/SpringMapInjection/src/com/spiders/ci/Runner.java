package com.spiders.ci;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	
	
	public static void main(String[] args) {
		
		// guy with the power
		// will create the object 
		// at run time
		ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
		
		Galaxy milkyWay = (Galaxy)container.getBean("milkyWay");
	//	Galaxy andromeda = (Galaxy)container.getBean("andromeda");
		System.out.println(milkyWay);
		System.out.println("--------");
	//	System.out.println(andromeda);
		
		
	}
}
