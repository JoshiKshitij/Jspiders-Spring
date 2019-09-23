package com.di.app;

public class Laptop {

	String brand;
	int ram;

	public Laptop(String brand) {
		super();
		System.out.println("String para cntrcutor");
		this.brand = brand;
	}

	public Laptop(int ram) {
		super();
		System.out.println("int  para cntrcutor");
		this.ram = ram;
	}

	public Laptop() {
		super();
		System.out.println("zero para contructor"); // TODO Auto-generated constructor stub
	}

	public Laptop(String brand, int ram) {
		super();
		System.out.println("String - int  para contructor");
		this.brand = brand;
		this.ram = ram;
	}

	public Laptop(int ram, String brand) {
		super();
		System.out.println("int - String  para contructor"); // TODO Auto-generated constructor stub
		this.brand = brand;
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + "]";
	}

}
