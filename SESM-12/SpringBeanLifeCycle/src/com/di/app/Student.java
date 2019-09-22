package com.di.app;

import java.util.List;
import java.util.Set;

public class Student {

	private String name;
	private int age;

	public void myInit() {
		System.out.println("init mehod called");
	}

	public void myDestroy() {
		System.out.println("Destroy mehod called");
	}

	public Student() {
		System.out.println("Student created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
