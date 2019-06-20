package com.pro.uas.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pro.uas.dto.Participant;
import com.pro.uas.service.UniversityServiceJPAImpl;

@Controller
@RequestMapping(value= "/log")
public class AddParticipant {

	@Autowired
	UniversityServiceJPAImpl services;
	

	@GetMapping(value= "/addparticipant")
	public ModelAndView addParticipant(ModelAndView mv) {
		mv.setViewName("AddParticipant");
		return mv;
	}
	
	@RequestMapping(value="/addparticipant", method=RequestMethod.POST)
	public ModelAndView addParticipant( Participant p, ModelAndView mv) {
		mv.setViewName("Success");
		boolean state = services.addParticipant(p);
		String msg = "Failed to add student Data";
		if(state) {
			msg = "Student data added";
		}
		mv.addObject("Success",msg);
		return mv;
	}
}

	


