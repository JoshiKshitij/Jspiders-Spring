package com.mvc.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.basic.dao.CricketTeamDao;
import com.mvc.basic.dto.CricketTeam;

@Controller
public class CricketTeamController {
	
	@Autowired
	CricketTeamDao cto;
	
	@RequestMapping("/")
	String index() {
		return "index";
	}
	
	@RequestMapping(value = "/getTeamData" ,method = RequestMethod.POST)
	String getTeamData(CricketTeam team ) {
		System.out.println(team);
		cto.save(team);
		return "index";
	}
	
	
}
