package com.pro.uas.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pro.uas.dto.ProgramsOffered;
import com.pro.uas.service.UniversityServiceJPAImpl;

@Controller
@RequestMapping(value= "/log")
public class AddProOfferedController {

	@Autowired
	UniversityServiceJPAImpl services;
	

	@GetMapping(value= "/addprogram")
	public ModelAndView addPage(ModelAndView mv) {
		mv.setViewName("addprogram");
		return mv;
	}
	
	@RequestMapping(value="/addprogram", method=RequestMethod.POST)
	public ModelAndView addProgram( ProgramsOffered po, ModelAndView mv) {
		mv.setViewName("Success");
		boolean state = services.addProgramOffered(po);
		String msg = "Failed to add Program Data";
		if(state) {
			msg = "Program Data  is added";
		}
		mv.addObject("Success",msg);
		return mv;
	}
}

	

