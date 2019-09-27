package app.container;

import org.springframework.stereotype.Component;

@Component
public class StudentJdbcLogic implements StudentPersistanceLogicInterface {

	@Override
	public void saveStudent() {
		System.out.println("Student saved using JDBC");

	}

	@Override
	public void deleteStudent() {
		System.out.println("Student deleted using JDBC");

	}

}
