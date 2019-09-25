package app.container;

import org.springframework.stereotype.Component;

@Component("myRef")
public class Student {

	String name = "ram";
	
	public Student() {
		System.out.println("studen object created");
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	

}
