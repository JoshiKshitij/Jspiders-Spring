package app.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("Spring-core.xml");

		StudentController controller = con.getBean( StudentController.class);

		controller.getPersistcaeLogic().saveStudent();
		controller.getPersistcaeLogic().deleteStudent();

	}

}
