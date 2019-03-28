package org.jspiders;

import java.util.List;

public class Computer {

	private String brand;
	private String model;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Computer() {
		super();
		System.out.println("object created of computer");
	}

	

	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", model=" + model + "]";
	}

}
