package com.setterinjectioon.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		AbstractApplicationContext container 
			= new ClassPathXmlApplicationContext("context.xml");
		
		Student ram = container.getBean("s1", Student.class);
		//System.out.println(ram);
		container.close();
		
		
		
		List<String> list = new ArrayList() {{
				 add("kshtiij");
		}};
		
		
	}

}
