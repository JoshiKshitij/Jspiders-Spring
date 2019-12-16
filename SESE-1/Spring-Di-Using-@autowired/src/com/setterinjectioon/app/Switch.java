package com.setterinjectioon.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Switch {

	@Autowired
	private Bulb bulb ;

	public void switchOn() {
		System.out.println("Switch On");
		bulb.bulbOn();
	}

	public Switch() {
		System.out.println("switch created");
	}

}
