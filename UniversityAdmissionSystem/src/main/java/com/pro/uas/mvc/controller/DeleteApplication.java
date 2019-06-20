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
public class DeleteApplication {
	
	@Autowired
	UniversityServiceJPAImpl services;


	@GetMapping("/deleteapp")
	public ModelAndView addPage(ModelAndView mv) {
		mv.setViewName("Deleteapplication");
		return mv;
	}

	@RequestMapping(value="/deleteapp", method=RequestMethod.POST)
	public ModelAndView deleteApplication(@RequestParam("applicationId") int applicationId, ModelAndView mv) {
		mv.setViewName("Success");
		boolean state = services.deleteApplication(applicationId);
		String msg = "Failed to delete student application Data ";
		if(state) {
			msg = "Student application Data Deleted";
		}
		mv.addObject("Success",msg);
		return mv;


	}
}




