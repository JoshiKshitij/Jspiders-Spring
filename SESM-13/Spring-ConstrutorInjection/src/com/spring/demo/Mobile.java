package com.spring.demo;

public class Mobile {
	
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", brand=" + brand + "]";
	}

	String name ;
	String brand;
	
	public Mobile(String name, String brand) {
		super();
		this.name = name;
		this.brand = brand;
	}
	
	

}
