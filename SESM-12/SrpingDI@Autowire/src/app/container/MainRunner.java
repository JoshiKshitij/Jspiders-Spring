package app.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("Spring-core.xml");
		
		Student student = con.getBean("student",Student.class);
		Book book = con.getBean("book",Book.class);
		
		
		System.out.println(student);
		System.out.println(book);
	
		
	}

}
