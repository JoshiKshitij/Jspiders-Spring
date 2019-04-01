package org.jspiders;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("comp")
@Scope("prototype")
public class Computer {

	private String brand;
	private String model;

	
	@PostConstruct
	void initComp() {
		System.out.println("init method called");
	}

	@PreDestroy
	void destroyComp() {
		System.out.println("destroy method called");
	}

	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Computer() {
		super();
		System.out.println("computer created");
		// TODO Auto-generated constructor stub
	}

	public Computer(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", model=" + model + "]";
	}

}
