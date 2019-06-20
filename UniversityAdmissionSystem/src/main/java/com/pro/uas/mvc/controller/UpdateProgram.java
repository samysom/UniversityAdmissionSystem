package com.pro.uas.mvc.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.pro.uas.dto.ProgramsOffered;
import com.pro.uas.service.UniversityServiceJPAImpl;

@Controller
@RequestMapping(value= "/log")
public class UpdateProgram {


	@Autowired
	UniversityServiceJPAImpl services;

	@RequestMapping(value= "/update",method=RequestMethod.GET)
	public ModelAndView getupdateProgramoffered(ModelAndView mv)
	{
		mv.setViewName("updatepro");
		return mv;
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public ModelAndView updateProgramoffered(@RequestParam("ProgramName")String name, @RequestParam("Description") String desc,
			@RequestParam("Applicant_eligibility") String eligibility, @RequestParam("Duration") int dur,
			@RequestParam("Degree_certificate_offered")String certificate, ModelAndView mv) {

		mv.setViewName("Success");

		ProgramsOffered po=new ProgramsOffered();
		po.setProgramName(name);
		po.setDescription(desc);
		po.setEligibility(eligibility);
		po.setDuration(dur);
		po.setDegreecertificateOffered(certificate);

		boolean state = services.updateProgramOffered(po);
		String msg = "Failed to update Program Data";
		if(state) {
			msg = "Program Data updated successfully";
		}
		mv.addObject("Success",msg);
		return mv;

	}
}







