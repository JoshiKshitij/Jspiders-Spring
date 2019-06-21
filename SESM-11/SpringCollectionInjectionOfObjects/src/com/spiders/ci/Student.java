package com.spiders.ci;

import java.util.Collection;

public class Student {
	
	private String name;
	private String rollNo;
	private String stream;
	private Collection<Address> listOfAddress;


	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", stream=" + stream + ", listOfAddress="
				+ listOfAddress + "]";
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String name, String rollNo, String stream, Collection<Address> listOfAddress) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.stream = stream;
		this.listOfAddress = listOfAddress;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRollNo() {
		return rollNo;
	}


	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}


	public String getStream() {
		return stream;
	}


	public void setStream(String stream) {
		this.stream = stream;
	}


	public Collection<Address> getListOfAddress() {
		return listOfAddress;
	}


	public void setListOfAddress(Collection<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}

	
	
}
