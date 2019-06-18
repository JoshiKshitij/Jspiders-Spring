package com.spiders.mi;

public class Computer {

	MotherBoard motherBoard;
	private String brand;
	private double price;

	@Override
	public String toString() {
		return "Computer [motherBoard=" + motherBoard + ", brand=" + brand + ", price=" + price + "]";
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

	public MotherBoard getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(MotherBoard motherBoard) {
		this.motherBoard = motherBoard;
	}

	public Computer(MotherBoard motherBoard, String brand, double price) {
		super();
		this.motherBoard = motherBoard;
		this.brand = brand;
		this.price = price;
	}

}
