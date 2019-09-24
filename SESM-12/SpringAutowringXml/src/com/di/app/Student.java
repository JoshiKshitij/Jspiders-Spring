package com.di.app;

public class Student {

	private String name = "yumraaj";
	
	private Laptop apple;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", apple=" + apple + "]";
	}

	public Laptop getApple() {
		return apple;
	}

	public void setApple(Laptop apple) {
		this.apple = apple;
	}

	

}
