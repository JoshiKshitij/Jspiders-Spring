package com.mvc.basic;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	ModelAndView helloMvc() {
		System.out.println("Hello MVC");
		
		// get data from db fro all user
		
		return new ModelAndView("index.jsp");
	}
	
	
	@RequestMapping("/pathVarrible/{abc}")
	ModelAndView pathVArriableTest(@PathVariable (name = "abc") String value ) {
		System.out.println("path varriable " + value);
		
		return new ModelAndView("index.jsp");
	}
	

	@RequestMapping("/getData")
	ModelAndView requestParamTest(
			@RequestParam(name = "userName") String userName 
			,@RequestParam(name = "password") String password  ) {
		
		
		System.out.println("user name - " + userName);
		System.out.println("password - " + password);
		
		return new ModelAndView("index.jsp");
	}
	
	

	public HelloController() {
		System.out.println("Hello Conroller");
	}
	
	
	

}
