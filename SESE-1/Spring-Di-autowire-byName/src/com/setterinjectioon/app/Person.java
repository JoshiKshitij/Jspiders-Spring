package com.setterinjectioon.app;

public class Person {

	// this reference matter a lot in ByName
	// as we have created an object with this reference in contect.xml
	Car audi;

	void startAudi() {
		audi.startEngine();
	}
	
	public Car getAudi() {
		return audi;
	}

	public void setAudi(Car audi) {
		this.audi = audi;
	}
	
	

}
