package com.mvc.basic;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.basic.dto.LoginDto;

@Controller
public class HelloController {

	@RequestMapping("/data/{a}")
	ModelAndView methodOne(@PathVariable(name = "a") String value) {
		System.out.println(value);

		return new ModelAndView("index.jsp");
	}

	@RequestMapping("/getData")
	ModelAndView methodTwo(LoginDto data , Model model) {
		System.out.println(data);
		
		model.addAttribute("un", data.getUserName());
		model.addAttribute("pw", data.getPassword());
		return new ModelAndView("display.jsp");
			
		//ModelAndView mav = new ModelAndView();
		//mav.addObject("key", "value");
		//mav.setViewName("display.jsp");;
		//return mav;
		
	}
	
	
	
	
	
}
