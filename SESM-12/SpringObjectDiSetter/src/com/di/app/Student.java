package com.di.app;

public class Student {

	private String name;

	private String mobileNO;

	private Laptop laptop;

	public Student() {
		System.out.println("student created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNO() {
		return mobileNO;
	}

	public void setMobileNO(String mobileNO) {
		this.mobileNO = mobileNO;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		System.out.println("laptop has been set");
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", mobileNO=" + mobileNO + ", laptop=" + laptop + "]";
	}

}
