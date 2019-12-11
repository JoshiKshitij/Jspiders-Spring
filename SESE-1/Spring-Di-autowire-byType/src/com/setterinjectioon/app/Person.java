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

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
