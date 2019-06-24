package com.spiders.ci;

public class Address {

	private String pincode;
	private String state;
	private String city;
	private String street;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String pincode, String state, String city, String street) {
		super();
		this.pincode = pincode;
		this.state = state;
		this.city = city;
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", state=" + state + ", city=" + city + ", street=" + street + "]";
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}
