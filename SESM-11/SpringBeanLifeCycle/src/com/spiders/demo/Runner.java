package com.spiders.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {

		System.out.println("creating container");
		AbstractApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
	
		Human aman = (Human) container.getBean("aman");
		System.out.println(aman);
		
		container.close();

	}

}
