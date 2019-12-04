import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainer {

	public static void main(String[] args) {

		// new ClassPathXmlApplicationContext(" xml file name will come here ")
		ApplicationContext container = new ClassPathXmlApplicationContext("context.xml");
		System.out.println("container created");
		
		
		Student s1 = container.getBean("s1", Student.class);
		Student s11 = (Student)container.getBean("s1");
		System.out.println(s1 ==s11);
		
		
	}

}
