package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// meta info for the container that please create 
// an object for this particular object
// of this Class with you
@Component
// MyDemoApp myDemoApp = new MyDemoApp();
public class MyDemoApp {

	@Autowired
	MySqlDao dao;
	
	public void saveObject() {
		dao.saveObject();
	}
	

}
