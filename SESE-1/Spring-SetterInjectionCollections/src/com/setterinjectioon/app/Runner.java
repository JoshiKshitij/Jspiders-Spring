package com.setterinjectioon.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("context.xml");
		
		//Student ramWithList = container.getBean("s1", Student.class);
		//System.out.println(ramWithList);
		
		Student ramcharnWithSet = container.getBean("s2", Student.class);
		System.out.println(ramcharnWithSet);
	
		
		//Student raju = container.getBean("s2", Student.class);
		//System.out.println(raju);
	}

}
