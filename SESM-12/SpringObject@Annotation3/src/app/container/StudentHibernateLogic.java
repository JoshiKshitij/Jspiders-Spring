package app.container;

import org.springframework.stereotype.Component;

@Component
public class StudentHibernateLogic implements StudentPersistanceLogicInterface {

	@Override
	public void saveStudent() {
	System.out.println("Student saved using hibernate");
		
	}

	@Override
	public void deleteStudent() {
		System.out.println("Student deleted using hibernate");	// TODO Auto-generated method stub
		
	}

	
	
}
