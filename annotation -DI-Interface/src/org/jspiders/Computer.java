package org.jspiders;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("comp")
public class Computer {

	private String brand;
	private String model;

	@Autowired
	ComputerUtils utils;
	
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


}
