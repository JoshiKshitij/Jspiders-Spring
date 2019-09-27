package app.container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StudentController {

	@Autowired
	@Qualifier("studentJdbcLogic")
	StudentPersistanceLogicInterface persistcaeLogic;

	public StudentPersistanceLogicInterface getPersistcaeLogic() {
		return persistcaeLogic;
	}

	public void setPersistcaeLogic(StudentPersistanceLogicInterface persistcaeLogic) {
		this.persistcaeLogic = persistcaeLogic;
	}

}
