package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public ModelAndView welcome() {
		System.out.println("called");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		return new ModelAndView("data.jsp");
	}
	
	@RequestMapping("/goodBye")
	public ModelAndView goodBye() {
		System.out.println("called");
		return new ModelAndView("bye.jsp");
	}
}
