package com.mvc.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	ModelAndView helloMvc() {
		System.out.println("Hello MVC");
		
		// get data from db fro all user
		
		return new ModelAndView("index.jsp");
	}

	public HelloController() {
		System.out.println("Hello Conroller");
	}
	
	
	

}
