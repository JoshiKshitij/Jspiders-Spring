package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Student;

@Controller
public class StudentController {

	@RequestMapping("/login")
	ModelAndView login(@RequestParam(name = "studentName") String name,
			@RequestParam(name = "password") String password, Model model) {
		System.out.println("login called");
		System.out.println(name);
		System.out.println(password);

		// will send data to the page called
		model.addAttribute("userName", name);
		model.addAttribute("pwd", password);

		return new ModelAndView("data.jsp");
	}

	ModelAndView login1(String name, String password) {
		System.out.println(name);
		System.out.println(password);
		return new ModelAndView("data.jsp");
	}

	@RequestMapping(value = "/studentDetails", method = RequestMethod.POST)
	ModelAndView studentDeyails(@ModelAttribute Student student ,BindingResult  result
			) {
		
		// if data has error this contiondion is true
		if(result.hasErrors()) {
			return new ModelAndView("AddStudent.jsp");
		}
		
		System.out.println(student);
		// model.addAttribute("stud", student);
		return new ModelAndView("StudentDetails.jsp");
	}

}
