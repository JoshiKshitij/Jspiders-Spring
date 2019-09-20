package com.di.app;

import java.util.Scanner;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) throws BeansException, ClassNotFoundException {

		// Read about Connection Pooling

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-core.xml");
		System.out.println("Container created");

		Student student = context.getBean("student", Student.class);
		System.out.println(student);

	}

}
