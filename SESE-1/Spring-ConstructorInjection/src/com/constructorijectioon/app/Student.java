package com.constructorijectioon.app;

public class Student {
	
	private int rollNo;
	private String name;
	
	// for constructor injection 
	// we dont need setter and getters
	// we require parameterized contructors
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	public Student(String name) {
		super();
		System.out.println(" String type");
		this.name = name;
	}

	public Student(int rollNo) {
		super();
		this.rollNo = rollNo;
		System.out.println("int type");
	}


	public Student() {
	System.out.println("defalut or non args constructor");
	}
	
	
	

}
