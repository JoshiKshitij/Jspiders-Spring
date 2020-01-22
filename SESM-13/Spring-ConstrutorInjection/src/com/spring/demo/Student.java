package com.spring.demo;

public class Student {
	
	String name;
	int age;
	
	Student(){
		System.out.println(" - defualt const called -");
	}
	
	Student(String name , int age){
		
		System.out.println("String int construtor");
		this.name = name;
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	

}
