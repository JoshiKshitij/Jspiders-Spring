package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		System.out.println("container created");
		AbstractApplicationContext contianer = new ClassPathXmlApplicationContext("context.xml");
		
		Human ram = contianer.getBean(Human.class);
		
		System.out.println("contianeris being destroyed");
		contianer.close();
		System.out.println("contianer destroyed");
 	}

}
