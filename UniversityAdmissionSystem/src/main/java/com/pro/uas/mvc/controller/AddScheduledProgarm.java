package com.pro.uas.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pro.uas.dto.ProgrammsScheduled;
import com.pro.uas.service.UniversityServiceJPAImpl;

@Controller
@RequestMapping(value= "/log")
public class AddScheduledProgarm {

	@Autowired
	UniversityServiceJPAImpl services;


	@GetMapping("/addschprogramm")
	public ModelAndView createScheduledProgram(ModelAndView mv) {
		mv.setViewName("SchProgramm");
		return mv;
	}

	@RequestMapping(value="/addschprogramm", method=RequestMethod.POST)
	public ModelAndView createScheduledProgram(ProgrammsScheduled Ps1, ModelAndView mv) {
		mv.setViewName("Success");
		boolean state = services.createScheduledProgram(Ps1);
		String msg = "Failed to add Scheduled Program Data";
		if(state) {
			msg = "Scheduled Program Data  is added";
		}
		mv.addObject("Success",msg);
		return mv;
	}
}






