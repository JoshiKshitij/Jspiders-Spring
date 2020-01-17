package com.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	
	public static void main(String[] args) {
		// create Spring container
		//Step 1
		ApplicationContext container =
				// add Spring-core.xml in src folder 
				// as class path starts from the src folder
				// we can configure the class path if we want
				new ClassPathXmlApplicationContext("Spring-core.xml");
		System.out.println("container created");
		
		Student student = container.getBean("std", Student.class);
		student.study();
		
		
	}

}
