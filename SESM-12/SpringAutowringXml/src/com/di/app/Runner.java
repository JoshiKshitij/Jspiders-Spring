package com.di.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("Spring-core.xml");

		Student s = container.getBean("yumraj", Student.class);

		System.out.println(s);

	}

}
