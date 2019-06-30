package com.mvc.app.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class StudentDto implements Serializable{

	private String name;
	private String login;
	private String password;
	private int age;
	
	@Id
	@GenericGenerator(name = "inc", strategy = "increment")
	@GeneratedValue(generator = "inc")
	private int rollNo;

	public StudentDto(String name, String login, String password, int age, int rollNo) {
		super();
		this.name = name;
		this.login = login;
		this.password = password;
		this.age = age;
		this.rollNo = rollNo;
	}

	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", login=" + login + ", password=" + password + ", age=" + age + ", rollNo="
				+ rollNo + "]";
	}

}
