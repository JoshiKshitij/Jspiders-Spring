package com.setterinjectioon.app;

import org.springframework.stereotype.Component;

@Component
public class Bulb implements Light {

	public void lightOn() {
		System.out.println("bulb On");
	}

	public Bulb() {
		System.out.println("bulb created");
	}
	
	
}
