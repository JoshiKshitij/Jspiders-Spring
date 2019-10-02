package com.btm.mvc;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student implements Serializable {

	
	
	@Id
	private int rollNo;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String fName;
	private String lName;
	private int age;
	private String stream;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", fName=" + fName + ", lName=" + lName + ", age=" + age + ", stream="
				+ stream + "]";
	}

}
