package com.setterinjectioon.app;

public class Person {

	public Person() {
		System.out.println("person created");
	}

	Car car;

	public void startCar() {
		car.startEngine();
	}

	public void stopCar() {
		car.stopEngine();
	}

	// papa construtor for autowiring by contructor
	public Person(Car car) {
		super();
		this.car = car;
	}
}
