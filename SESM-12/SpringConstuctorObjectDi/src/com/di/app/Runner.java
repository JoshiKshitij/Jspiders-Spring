package com.di.app;

import java.util.Scanner;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) throws BeansException, ClassNotFoundException {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-core.xml");

		Student student = context.getBean("surya", Student.class);

	//	Laptop lap = context.getBean("laptop", Laptop.class);
		System.out.println(student);

	}

}
