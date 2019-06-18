package com.spiders.ci;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaRunner {
	
	
	public static void main(String[] args) {
		
	Galaxy milkyWay = new Galaxy();
	milkyWay.setName("Mikly Way");
		
		
	List<String> namesOfStars = new ArrayList<String>();
	namesOfStars.add("orian");
	namesOfStars.add("pole star");
	namesOfStars.add("sun");
	
	milkyWay.setStarsName(namesOfStars);
	
	System.out.println(milkyWay);
	
	
		
	}
}
