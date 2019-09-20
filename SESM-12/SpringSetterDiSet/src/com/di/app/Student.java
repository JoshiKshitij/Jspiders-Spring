package com.di.app;

import java.util.List;
import java.util.Set;

public class Student {

	private String name;
	private int age;

	Set<String> subjects;

	public Set<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<String> subjects) {
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
		return "Student [name=" + name + ", age=" + age + " students" + subjects;
	}

}
