package com.di.app;

import java.util.List;
import java.util.Map;

public class Student {

	private String name;

	private String mobileNO;

	private Map<String, Laptop> laptops;

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

	public Map<String, Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(Map<String, Laptop> laptops) {
		this.laptops = laptops;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", mobileNO=" + mobileNO + ", laptops=" + laptops + "]";
	}

	
}
