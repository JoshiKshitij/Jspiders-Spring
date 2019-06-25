package com.spiders.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {

		// will read xml and will create the object and store within it
		ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");

		// will return the object which are available to container
		System.out.println("coantiner created");

		System.out.println((Human) container.getBean("human"));

	}

}
