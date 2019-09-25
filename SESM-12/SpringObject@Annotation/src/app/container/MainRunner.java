package app.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("Spring-core.xml");
		
		Student bean = con.getBean("myRef",Student.class);
		
		
		System.out.println(bean);
	
	
	}

}
