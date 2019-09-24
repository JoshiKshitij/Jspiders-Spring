package com.di.app;

public class Laptop {

	private String brand = "Apple" ;
	
	public void laptopName(){
		System.out.println("brand - > "+brand);
		
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + "]";
	}

}
