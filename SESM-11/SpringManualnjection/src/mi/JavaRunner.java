package com.spiders.mi;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaRunner {
	
	
	public static void main(String[] args) {
		
	MotherBoard mb = new MotherBoard();
	Computer computer = new Computer();
	
	computer.setMotherBoard(mb);
	
	computer.setMotherBoard(new MotherBoard());
	
	System.out.println(computer);
		
	}
}
