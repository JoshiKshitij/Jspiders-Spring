package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext contianer = new ClassPathXmlApplicationContext("context.xml");
		System.out.println("container created");

		Manager mgr = 
				contianer.getBean("mgr" , Manager.class);
		System.out.println(mgr);

		Employee e1 = 
				contianer.getBean("e1" , Employee.class);
		System.out.println(e1);
		
	}

}
