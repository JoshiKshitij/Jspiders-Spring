package app.container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	String name = "ram";

	@Autowired
	Book book;

	public Student() {
		System.out.println("studen object created");

	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", book=" + book + "]";
	}

}
