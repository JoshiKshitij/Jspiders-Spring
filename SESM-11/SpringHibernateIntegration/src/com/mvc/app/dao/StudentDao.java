package com.mvc.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.app.dto.StudentDto;


@Repository
public class StudentDao {

	@Autowired
	SessionFactory sessionFactory;
	
	
	public int saveStudent(StudentDto student){
		
		System.out.println("student saved");
		
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		// some logic to save student
		int id = (int)session.save(student);
		
		transaction.commit();
		

		return id;
	}
}
