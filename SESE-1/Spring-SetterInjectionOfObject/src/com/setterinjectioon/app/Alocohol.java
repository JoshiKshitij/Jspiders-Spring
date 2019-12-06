package com.setterinjectioon.app;

public class Alocohol {

	private String brand;
	private double quantity;

	// associated Object
	private Water water;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public Water getWater() {
		return water;
	}

	public void setWater(Water water) {
		this.water = water;
	}

	@Override
	public String toString() {
		return "Alocohol [brand=" + brand + ", quantity=" + quantity + ", water=" + water + "]";
	}
	
	 public Alocohol() {
		super();
		System.out.println("Alcohol object created");
	}

}
