package com.di.app;

public class Student {

	private String name;
	private String mobileNO;

	public Student() {
		super();
		System.out.println("zero para contructor"); // TODO Auto-generated constructor stub
	}

	public Student(String name) {
		System.out.println("one para Student created");
		this.name = name;
	}

	public Student(String name, String mobileNO) {
		super();
		System.out.println("two para Student created");
		this.name = name;
		this.mobileNO = mobileNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", mobileNO=" + mobileNO + "]";
	}

}
