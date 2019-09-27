package app.container;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Component
@Primary
public class Dog implements Pet{

	String dogName = "T-Rex";
	
	public Dog() {
		System.out.println("dog object created");
		
	}

	@Override
	public String toString() {
		return "Dog [dogName=" + dogName + "]";
	}
	
	

}
