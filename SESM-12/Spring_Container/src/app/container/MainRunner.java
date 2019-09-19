package app.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {

	public static void main(String[] args) {

		// application container in spring core
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-core.xml");
		System.out.println("contianer created");

		Student ram = (Student) context.getBean("ram");

		System.out.println(ram);
	
		
	}

}
