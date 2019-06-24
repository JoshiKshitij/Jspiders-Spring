package com.spiders.ci;

public class Student {

	private String name;
	private String rollNo;
	private String stream;
	private Address add;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String rollNo, String stream, Address add) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.stream = stream;
		this.add = add;
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

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", stream=" + stream + ", add=" + add + "]";
	}

}
