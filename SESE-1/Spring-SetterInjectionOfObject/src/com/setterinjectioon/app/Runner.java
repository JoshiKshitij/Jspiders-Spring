package com.setterinjectioon.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("context.xml");
		
		Alocohol jd = 
				container.getBean(Alocohol.class);
		Water tapWater = 
				container.getBean(Water.class);

		System.out.println(jd);
		System.out.println(tapWater);
			
	}

}
