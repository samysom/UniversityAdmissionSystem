package com.pro.uas.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.uas.dto.Participant;
import com.pro.uas.service.UniversityServiceJPAImpl;

@Controller
@RequestMapping(value= "/log")
public class DeleteParticipant {
	
	@Autowired
	UniversityServiceJPAImpl services;


	@GetMapping("/deleteparticipant")
	public ModelAndView addPage(ModelAndView mv) {
		mv.setViewName("DeleteParticipant");
		return mv;
	}

	@RequestMapping(value="/deleteparticipant", method=RequestMethod.POST)
	public ModelAndView deleteParticipant( @RequestParam("rollNo")int rollNo, ModelAndView mv) {
		mv.setViewName("Success");
		

		Participant p=new Participant();
		p.setRollNo(rollNo);
		
		boolean state = services.deleteParticipant(rollNo);
		String msg = "Failed to deleted student Data";
		if(state) {
			msg = "Succesfully deleted Student data";
		}
		mv.addObject("Success",msg);
		return mv;
	}
}
