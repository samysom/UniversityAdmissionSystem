package com.pro.uas.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.uas.dto.Application;
import com.pro.uas.service.UniversityServiceJPAImpl;

@Controller
@RequestMapping(value= "/log")
public class UpdateApplication {

	@Autowired
	UniversityServiceJPAImpl services;

	@RequestMapping(value= "/updateapplication",method=RequestMethod.GET)
	public ModelAndView getChangeMobilePage(ModelAndView mv)
	{
		mv.setViewName("UpdateApplication");
		return mv;
	}

	@RequestMapping(value= "/updateapplication", method=RequestMethod.POST)
	public ModelAndView updateApplication(@RequestParam("interviewDate") String interviewDate,
			@RequestParam("applicationId") int applicationId, ModelAndView mv) {

		mv.setViewName("Success");		
		Application ap=new Application();
		ap.setInterviewDate(interviewDate);
		ap.setApplicationId(applicationId);


		boolean state = services.updateApplication(interviewDate, applicationId);
		String msg = "Failed to update applicant details";
		if(state) {
			msg = "Applicants details updated successfully";
		}
		mv.addObject("Success",msg);
		return mv;

	}
}







