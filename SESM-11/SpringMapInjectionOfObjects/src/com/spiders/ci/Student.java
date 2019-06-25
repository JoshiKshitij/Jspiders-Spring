package com.spiders.ci;

import java.util.Collection;
import java.util.Map;

public class Student {

	private String name;
	private String rollNo;
	private String stream;
	private Map<Integer, Address> mapOfAddress;

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", stream=" + stream + ", mapOfAddress=" + mapOfAddress
				+ "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String rollNo, String stream, Map<Integer, Address> mapOfAddress) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.stream = stream;
		this.mapOfAddress = mapOfAddress;
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

	public Map<Integer, Address> getMapOfAddress() {
		return mapOfAddress;
	}

	public void setMapOfAddress(Map<Integer, Address> mapOfAddress) {
		this.mapOfAddress = mapOfAddress;
	}

}
