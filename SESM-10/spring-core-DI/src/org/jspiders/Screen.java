package org.jspiders;

public class Screen {

	private int screenSize;
	private String brand;

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Screen(int screenSize, String brand) {
		super();
		this.screenSize = screenSize;
		this.brand = brand;
	}

	public Screen() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Screen [screenSize=" + screenSize + ", brand=" + brand + "]";
	}

}
