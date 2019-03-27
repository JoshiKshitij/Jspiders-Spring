package org.jspiders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	
	public static void main(String[] args) {
		ApplicationContext conext = new ClassPathXmlApplicationContext("org/jspiders/context.xml");
		
		Computer computer = conext.getBean(Computer.class, "com");
		
		System.out.println(computer);
		
		/*
		 * Object scr = conext.getBean(Screen.class, "scr"); System.out.println(scr);
		 */
	}
}
