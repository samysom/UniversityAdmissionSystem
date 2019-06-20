package com.pro.uas.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value= "/stud")
public class Student {

	
	@RequestMapping(value="/student",method=RequestMethod.GET)
	public String getLoginPage()
	{
		return "student";
	}

}
