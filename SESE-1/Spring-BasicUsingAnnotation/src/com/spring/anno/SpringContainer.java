package com.spring.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainer {

	public static void main(String[] args) {

		// new ClassPathXmlApplicationContext(" xml file name will come here ")
		ApplicationContext container = new ClassPathXmlApplicationContext("context.xml");
		System.out.println("container created");

		//Animal dog = container.getBean("animal", Animal.class);
		//System.out.println(dog);

	}

}
