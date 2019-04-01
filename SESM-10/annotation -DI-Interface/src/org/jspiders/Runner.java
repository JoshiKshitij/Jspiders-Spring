package org.jspiders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	
	public static void main(String[] args) {
		
		  ApplicationContext context = new
		  ClassPathXmlApplicationContext("org/jspiders/context.xml"); Computer com =
		  (Computer)context.getBean("comp"); System.out.println(com);
		 
		

		
	}
}
