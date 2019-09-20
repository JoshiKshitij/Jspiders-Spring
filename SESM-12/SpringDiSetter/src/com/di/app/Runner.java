package com.di.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("Spring-core.xml");
		System.out.println("container created");

		// Laptop lenvo = (Laptop)container.getBean("lenovo");
		// Laptop lenvo1 = (Laptop)container.getBean("lenovo");

		// System.out.println(lenvo);
	}

}
