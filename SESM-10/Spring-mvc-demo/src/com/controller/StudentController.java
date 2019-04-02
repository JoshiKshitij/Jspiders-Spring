package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping("/login")
	ModelAndView login(@RequestParam(name = "studentName" ,defaultValue ="12345") String name,
			@RequestParam(name = "password") String password) {
		System.out.println("login called");
		System.out.println(name);
		System.out.println(password);
		return new ModelAndView("data.jsp");
	}

	ModelAndView login1(String name, String password) {
		System.out.println(name);
		System.out.println(password);
		return new ModelAndView("data.jsp");
	}

}
