package com.spring.anno;

import org.springframework.stereotype.Component;

@Component
public class Animal {
	
	String name = " dog pintu ";

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

	public Animal() {
		
		System.out.println("animal created");
	}

}
