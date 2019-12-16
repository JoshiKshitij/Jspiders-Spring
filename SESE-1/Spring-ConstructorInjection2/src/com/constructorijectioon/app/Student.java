package com.constructorijectioon.app;

public class Student {
	
	private String rollNo;
	private String name;
	
	public Student(String name 
			, String rollNo) {
		super();
		System.out.println(" String- int type");
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

}
