package com.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	
	public static void main(String[] args) {
		ApplicationContext container =
				new ClassPathXmlApplicationContext("Spring-core.xml");
		System.out.println("container created");
		
		Person person = container.getBean( "person",Person.class);
		
		
	}

}
