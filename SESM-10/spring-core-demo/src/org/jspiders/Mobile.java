package org.jspiders;

public class Mobile {
	
	private String make;
	private String model;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}
	
}
