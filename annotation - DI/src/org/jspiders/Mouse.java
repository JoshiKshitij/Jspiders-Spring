package org.jspiders;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("mouse")
public class Mouse {

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

	public Mouse() {
		super();
		System.out.println("computer created");
		// TODO Auto-generated constructor stub
	}

	public Mouse(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	
	@Override
	public String toString() {
		return "Mouse [brand=" + brand + ", model=" + model + "]";
	}

}
