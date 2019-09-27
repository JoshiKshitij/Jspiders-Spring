package app.container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Man {

	String name = "ram";

	@Autowired
	//@Qualifier("dog")
	Pet pet ;

	@Override
	public String toString() {
		return "Man [name=" + name + ", pet=" + pet + "]";
	}

	
	
	
	
}
