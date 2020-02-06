package com.test.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {

//	@RequestMapping("/search")
//	ModelAndView searchStudent(@RequestParam String rollNo){

	@RequestMapping("/search/{rollNo}")
	ModelAndView searchStudent(@PathVariable String rollNo) {

		System.out.println("Roll no " +  rollNo);
		
		String student = "";

		Map<String, String> tempData = new HashMap<String, String>();
		tempData.put("1", "Ram");
		tempData.put("2", "Sham");
		tempData.put("3", "Bhrart");
		tempData.put("4", "kshitij");
		tempData.put("5", "Dhram");

		ModelAndView mv = new ModelAndView("data");

		if (tempData.containsKey(rollNo)) {
			student = tempData.get(rollNo);
			mv.addObject("std", student);
		}
		return mv;
	}

}
