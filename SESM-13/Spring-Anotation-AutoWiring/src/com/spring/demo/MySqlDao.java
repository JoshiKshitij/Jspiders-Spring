package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class MySqlDao {
	
	public void saveObject(){
		System.out.println("Object saved using MYSQL Implimenation");
	}
	

}
