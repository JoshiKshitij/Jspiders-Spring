package com.di.app;

import java.util.List;

public class Student {

	private String name;

	private String mobileNO;

	private List<Laptop> laptops;

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

	@Override
	public String toString() {
		return "Student [name=" + name + ", mobileNO=" + mobileNO + ", laptops=" + laptops + "]";
	}

	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

}
