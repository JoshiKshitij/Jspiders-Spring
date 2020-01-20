package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext contianer = new ClassPathXmlApplicationContext("context.xml");
		System.out.println("container created");

		// contianer.getBean(Class type)
		// contianer.getBean("String")
		// contianer.getBean("String" , Class tpye)

		
		
	//	 Laptop l1 = contianer.getBean(Laptop.class);
	//	 l1.laptopOn();
	//	 l1.laptopOFF();

	//	Object bean = contianer.getBean("l3");
	//	Laptop l1 = (Laptop) bean;
	//	l1.laptopOn();
	//	l1.laptopOFF();
		
		
	//	Laptop l1 = contianer.getBean("l1" , Laptop.class);
	//	l1.laptopOn();
	//	l1.laptopOFF();
		

	}

}
