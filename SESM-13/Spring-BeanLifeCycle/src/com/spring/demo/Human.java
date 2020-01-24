package com.spring.demo;

public class Human {

	public Human() {
		System.out.println("Object instantiation phase"); 
	}

	// init method
	public void giveName(){
		System.out.println("giving name / init phase");
	}
	
	
	// destory method
	public void death() {
		System.out.println("death  / destroy phase");
	}
	
	
}
