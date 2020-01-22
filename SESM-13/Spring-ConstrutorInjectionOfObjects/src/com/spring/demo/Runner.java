package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext contianer = new ClassPathXmlApplicationContext("context.xml");
		System.out.println("container created");

		// Student std = contianer.getBean("ram" , Student.class);
		// System.out.println(std);

		Water bisleri = contianer.getBean("bisleri", Water.class);
		System.out.println(bisleri);
		System.out.println("-------------");
		Fish shark = contianer.getBean("shark", Fish.class);
		System.out.println(shark);
		
		
	}

}
