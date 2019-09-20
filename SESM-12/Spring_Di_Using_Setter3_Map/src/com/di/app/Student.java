package com.di.app;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private String name;
	private int age;

	Map<String, Integer> subjects;

	public Map<String,Integer> getSubjects() {
		return subjects;
	}

	public void setSubjects(Map<String,Integer> subjects) {
		this.subjects = subjects;
	}

	public Student() {
		System.out.println("Object created");
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
		return "Student [name=" + name + ", age=" + age + ", subjects=" + subjects + "]";
	}

	
}
