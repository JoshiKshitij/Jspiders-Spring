package com.spiders.ci;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("dog eats");
	}
	

}
