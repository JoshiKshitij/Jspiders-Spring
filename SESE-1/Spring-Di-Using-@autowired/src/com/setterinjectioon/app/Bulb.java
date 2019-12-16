package com.setterinjectioon.app;

import org.springframework.stereotype.Component;

@Component
public class Bulb {

	public void bulbOn() {
		System.out.println("bulb On");
	}

	public Bulb() {
		System.out.println("bulb created");
	}
	
	
}
