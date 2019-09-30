package com.mvc;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	
	@RequestMapping(value = "/sayhello" , method = RequestMethod.GET)
	//@GetMapping("sayhello")
	ModelAndView sayHello() {

		System.out.println("say hello called in controller");
		
		return new ModelAndView("helloPage.jsp");
	}


}
