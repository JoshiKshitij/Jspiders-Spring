package org.jspiders;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("keyboard")
public class Keyboard {

	private String brand;
	private String model;

	
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

	public Keyboard() {
		super();
		System.out.println("computer created");
		// TODO Auto-generated constructor stub
	}

	public Keyboard(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	
	@Override
	public String toString() {
		return "Keyboard [brand=" + brand + ", model=" + model + "]";
	}

}
