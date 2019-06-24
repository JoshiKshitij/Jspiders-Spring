package com.spiders.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunnerApplicationContext {

	public static void main(String[] args) {

		System.out.println("container created");
		ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");

		
		/*
		 * System.out.println((Human) container.getBean("yum"));
		 * System.out.println((Human) container.getBean("yum"));
		 * System.out.println((Human) container.getBean("yum"));
		 */
		

	}

}
