package com.spiders.si;

public class Computer {
	
	// getter and setter
	// default contructor()
	// para contructor()
	// toString also

	private String brand;
	private double price;

	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", price=" + price + "]";
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Computer() {
		super();
		System.out.println("object create fffor computer");
	}

	public Computer(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}

}
