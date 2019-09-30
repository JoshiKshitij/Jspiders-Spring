package com.btm.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = "/login")
	ModelAndView loginMethod(@RequestParam(value = "loginId") String loginId,
			@RequestParam(value = "password") String password) {

		System.out.println("login  method called ->> "  + loginId + " "  + password);

		return new ModelAndView("index.jsp");
	}

}
