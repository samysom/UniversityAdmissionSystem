package com.pro.uas.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.uas.dto.ProgramsOffered;
import com.pro.uas.service.UniversityServiceJPAImpl;

@Controller
@RequestMapping(value= "/log")
public class DeleteProgram {

	@Autowired
	UniversityServiceJPAImpl services;


	@GetMapping("/delete")
	public ModelAndView addPage(ModelAndView mv) {
		mv.setViewName("Delete");
		return mv;
	}

	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ModelAndView deleteProgramOffered( @RequestParam("ProgramName")String programName, ModelAndView mv) {
		mv.setViewName("Success");
		

		ProgramsOffered po=new ProgramsOffered();
		po.setProgramName(programName);
		
		boolean state = services.deleteProgramOffered(programName);
		String msg = "Failed to delete Program Data";
		if(state) {
			msg = "Programm Data deleted";
		}
		mv.addObject("Success",msg);
		return mv;

	
	}
}






