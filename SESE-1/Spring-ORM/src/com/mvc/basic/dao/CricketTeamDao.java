package com.mvc.basic.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mvc.basic.dto.CricketTeam;

@Repository
public class CricketTeamDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public long save(CricketTeam team) {
		long id = 0;
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		id = (long
				)session.save(team);
		tx.commit();
		session.close();
		
		return id;
	}
	
	
}
