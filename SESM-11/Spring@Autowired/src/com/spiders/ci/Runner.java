package com.spiders.ci;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");

		Human human = (Human) container.getBean("human");
		human.animal.eat();
		
		
	}
}
