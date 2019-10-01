package com.btm.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	ModelAndView loginMethod(@RequestParam(value = "loginId") String UId, @RequestParam(value = "password") String pass,
			Model model) {

		System.out.println("login Id ->> " + UId);
		System.out.println("password ->> " + pass);

		
		// adding key value to model
		//model.addAttribute("String ", "Object"); key and value
		model.addAttribute("loginKey" , UId);
		model.addAttribute("passwordKey" , pass);
		
		
		return new ModelAndView("details.jsp");
	}
	

	@RequestMapping(value = "/pathTest/{myvalue}")
	ModelAndView pathVarriableMethod(@PathVariable(value = "myvalue") String var
		) {

		System.out.println("path varriable Id ->> " + var);
	
		return new ModelAndView("details.jsp");
	}
	
	

}
