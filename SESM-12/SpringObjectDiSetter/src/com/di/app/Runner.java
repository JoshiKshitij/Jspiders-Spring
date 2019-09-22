package com.di.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("Spring-core.xml");
		System.out.println("container created");

		Student ram = container.getBean("ram", Student.class);
		Laptop lenv = container.getBean("lenovo", Laptop.class);

		System.out.println(ram);
		System.out.println(lenv);
	}

}
