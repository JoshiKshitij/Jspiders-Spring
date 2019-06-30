package com.jspiders.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	
	// uri
	@RequestMapping("/sayHello")
	public ModelAndView sayHello() {
		return new ModelAndView("hello.jsp"); 
	}

}
