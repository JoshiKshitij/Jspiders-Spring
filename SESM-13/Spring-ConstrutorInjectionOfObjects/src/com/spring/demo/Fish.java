package com.spring.demo;

public class Fish {

	String typeOfFish;

	Water water;

	public Fish(String typeOfFish, Water water) {
		super();
		this.typeOfFish = typeOfFish;
		this.water = water;
	}

	@Override
	public String toString() {
		return "Fish [typeOfFish=" + typeOfFish + ", water=" + water + "]";
	}

}
