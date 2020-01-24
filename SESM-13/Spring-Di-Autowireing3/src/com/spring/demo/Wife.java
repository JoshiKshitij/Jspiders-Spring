package com.spring.demo;

public class Wife {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Wife [name=" + name + "]";
	}

	public Wife() {
		System.out.println("Wife created");
	}

}
