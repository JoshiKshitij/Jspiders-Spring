package com.spring.demo;

public class Tree {

	private String name;
	private int age;
	private String type;

	public Tree() {
		System.out.println("Tree created");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("tree setName() called");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		System.out.println("tree setAge() called");
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		System.out.println("tree setType() called");
		this.type = type;
	}

	

	@Override
	public String toString() {
		return "Tree [name=" + name + ", age=" + age + ", type=" + type + "]";
	}

}
