package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext contianer = new ClassPathXmlApplicationContext("context.xml");
		System.out.println("container created");

	//	Student std = contianer.getBean("ram" , Student.class);
	//	System.out.println(std);

		Mobile mobile = contianer.getBean("m1" , Mobile.class);
		System.out.println(mobile);
	}

}
