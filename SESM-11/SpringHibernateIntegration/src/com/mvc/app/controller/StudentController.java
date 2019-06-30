package com.mvc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.app.dao.StudentDao;
import com.mvc.app.dto.StudentDto;

@Controller
public class StudentController {

	
	@Autowired
	StudentDao dao ;
	
	
	@RequestMapping(value = "/studentInfo")
	public ModelAndView getStudentInfo(StudentDto student, Model model) {

		System.out.println(student);
		model.addAttribute("std", student);

		// save student
		dao.saveStudent(student);	
	
		return new ModelAndView("response.jsp");
	}

}
