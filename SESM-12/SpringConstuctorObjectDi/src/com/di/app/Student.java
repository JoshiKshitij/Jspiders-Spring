package com.di.app;

public class Student {

	private String name;
	private String mobileNO;
	private Laptop laptop;

	public Student(String name, String mobileNO, Laptop laptop) {
		super();
		this.name = name;
		this.mobileNO = mobileNO;
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", mobileNO=" + mobileNO + ", laptop=" + laptop + "]";
	}

}
