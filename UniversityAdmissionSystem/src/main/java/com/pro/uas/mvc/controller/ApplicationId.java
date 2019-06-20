package com.pro.uas.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.uas.dto.Participant;
import com.pro.uas.dto.ProgrammsScheduled;
import com.pro.uas.service.UniversityServiceJPAImpl;

@Controller
@RequestMapping("/Application")
public class ApplicationId {


	@Autowired
	UniversityServiceJPAImpl service;


	@RequestMapping(value="/partlist",method=RequestMethod.GET)
	public ModelAndView getAllApplications(ModelAndView mv)
	{
		mv.setViewName("Applicationid");
		return mv;
	}
	@RequestMapping(value="/partlist", method=RequestMethod.POST)
	public ModelAndView listAllApplications(ModelAndView mv, 
			@RequestParam("Email_id") String emailId) {
		mv.setViewName("Success");
		List<Participant> list = service.listParticipant(emailId);
		mv.addObject("Success", list);
		return mv;
	}
}



