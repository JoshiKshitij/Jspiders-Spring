package org.jspiders;

import java.util.List;

public class Computer {

	private String brand;
	private String model;

	List<String> listOfComponents;

	public List<String> getListOfComponents() {
		return listOfComponents;
	}

	public void setListOfComponents(List<String> listOfComponents) {
		this.listOfComponents = listOfComponents;
	}

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
		System.out.println("computer created");
		// TODO Auto-generated constructor stub
	}

	public Computer(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", model=" + model + ", listOfComponents=" + listOfComponents + "]";
	}

	// init method
	void initComp() {

		System.out.println("init method called");
	}

	void destroyComp() {

		System.out.println("destroy method called");
	}

}
