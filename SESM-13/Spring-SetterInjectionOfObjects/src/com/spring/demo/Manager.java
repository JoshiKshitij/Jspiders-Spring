package com.spring.demo;

public class Manager {
	
	private String name;
	private int age;
	private Employee emp;
	
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
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Manager [name=" + name + ", age=" + age + ", emp=" + emp + "]";
	}
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
