package com.spiders.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Human {
	
	
	@Value(value="ram")
	private String name;

	@Value(value="10")
	private int age;
	
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
	
	public Human() {
		super();
		System.out.println("objct created");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}

}
