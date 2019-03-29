package org.jspiders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("org/jspiders/context.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("org/jspiders/context.xml");
		Computer com = (Computer)context.getBean("comp");
		Computer com1 = (Computer)context.getBean("comp");
		Computer com2 = (Computer)context.getBean("comp");
		Computer com3 = (Computer)context.getBean("comp");
		
	}
}
