package com.setterinjectioon.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Switch {
	
	private Light light ;

	public void switchOn() {
		System.out.println("Switch On");
		light.lightOn();
	}

	@Autowired
	public Switch(@Qualifier("led") Light light) {
		System.out.println("switch created");
		this.light = light;
	}
	
	

}
