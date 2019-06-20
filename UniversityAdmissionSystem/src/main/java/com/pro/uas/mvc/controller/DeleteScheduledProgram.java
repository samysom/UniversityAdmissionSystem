package com.pro.uas.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.uas.service.UniversityServiceJPAImpl;

@Controller
@RequestMapping("/log")
public class DeleteScheduledProgram {
	
	@Autowired
	UniversityServiceJPAImpl services;


	@GetMapping("/deletesch")
	public ModelAndView addPage(ModelAndView mv) {
		mv.setViewName("Deletesch");
		return mv;
	}

	@RequestMapping(value="/deletesch", method=RequestMethod.POST)
	public ModelAndView deleteScheduledProgram( @RequestParam("scheduledProgramId")int scheduledProgramId, ModelAndView mv) {
		mv.setViewName("Success");
		boolean state = services.deleteScheduledProgram(scheduledProgramId);
		String msg = "Failed to delete scheduled Program Data";
		if(state) {
			msg = "scheduled programm Data deleted";
		}
		mv.addObject("Success",msg);
		return mv;

	}
}


