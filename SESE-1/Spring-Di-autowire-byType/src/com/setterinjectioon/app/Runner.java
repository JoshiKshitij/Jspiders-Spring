package com.setterinjectioon.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("context.xml");
		
		
			Person ram = container.getBean("ram", Person.class);
			ram.startCar();
	}

}
