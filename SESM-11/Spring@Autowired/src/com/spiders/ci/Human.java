package com.spiders.ci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Human {
	
	@Autowired
	@Qualifier("dog")
	Animal animal ;
	

}
