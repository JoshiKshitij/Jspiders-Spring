package org.jspiders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	
	public static void main(String[] args) {
		//ApplicationContext conext = new ClassPathXmlApplicationContext("org/jspiders/context.xml");
		
		AbstractApplicationContext conext = new ClassPathXmlApplicationContext("org/jspiders/context.xml");
		
		
		Computer computer = conext.getBean(Computer.class, "com");
		
		conext.close();
		/*
		 * Computer computer1 = conext.getBean(Computer.class, "com"); Computer
		 * computer2 = conext.getBean(Computer.class, "com"); Computer computer3 =
		 * conext.getBean(Computer.class, "com"); Computer computer4 =
		 * conext.getBean(Computer.class, "com");
		 */
		System.out.println(computer);
		
		
	}
}
