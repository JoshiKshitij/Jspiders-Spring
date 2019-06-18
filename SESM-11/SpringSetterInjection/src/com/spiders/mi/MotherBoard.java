package com.spiders.mi;

public class MotherBoard {
	

	private String brand;

	@Override
	public String toString() {
		return "MotherBoard [brand=" + brand + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public MotherBoard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MotherBoard(String brand) {
		super();
		this.brand = brand;
	}
	
 
}
