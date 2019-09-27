package app.container;

import org.springframework.stereotype.Component;



@Component
public class Cat implements Pet{

	String catName = "lion";
	
	public Cat() {
		System.out.println("dog object created");
		
	}

	@Override
	public String toString() {
		return "Cat [ctName=" + catName + "]";
	}
	
	

}
