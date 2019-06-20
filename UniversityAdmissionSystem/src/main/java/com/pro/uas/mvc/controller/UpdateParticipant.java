package com.pro.uas.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.uas.dto.Participant;
import com.pro.uas.service.UniversityServiceJPAImpl;

@Controller
@RequestMapping(value= "/log")
public class UpdateParticipant {
	
	@Autowired
	UniversityServiceJPAImpl services;
	
	@RequestMapping(value= "/updateparticipant",method=RequestMethod.GET)
	public ModelAndView updateParticipant(ModelAndView mv)
	{
		mv.setViewName("UpdateParticipant");
		return mv;
	}
	
	@RequestMapping(value="/updateparticipant", method=RequestMethod.POST)
	public ModelAndView updateParticipant(@RequestParam("Roll_no")int roll, @RequestParam("Email_id") String email,
			@RequestParam("Application_id") int application, @RequestParam("Scheduled_program_id") int program,
			@RequestParam("Application_Status")String status, ModelAndView mv) {
		
		mv.setViewName("Success");
		
		Participant p=new Participant();
		p.setRollNo(roll);
		p.setEmailId(email);
		p.setApplicationId(application);
		p.setProgrammId(program);
		p.setApplicationStatus(status);
		
		boolean state = services.updateParticipant(p);
		String msg = "Failed to update student Data";
		if(state) {
			msg = "Succesfully updated Student data";
		}
		mv.addObject("Success",msg);
		return mv;
	}
}





