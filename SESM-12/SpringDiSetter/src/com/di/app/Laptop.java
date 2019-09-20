package com.di.app;

public class Laptop {

	private String brand;
	private int ramSize;

	public Laptop() {
		System.out.println("laptop cerated");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ramSize=" + ramSize + "]";
	}

}
