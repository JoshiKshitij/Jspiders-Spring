package com.spiders.ci;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
	
	

	@Override
	public void eat() {
		System.out.println("cat eats");
	}

}
