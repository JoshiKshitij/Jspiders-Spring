package com.jspiders.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	// uri
	@RequestMapping("/login")
	public ModelAndView sayHello(
			@RequestParam  String userId ,
			@RequestParam  String password, Model model ) {
		
		System.out.println("login method called");
		
		System.out.println(userId);
		System.out.println(password);
		
		//model.addAttribute("key", "value");
		model.addAttribute("userId", userId);
		model.addAttribute("pass", password);
		
		return new ModelAndView("response.jsp"); 
	}

}
