package com.pro.uas.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pro.uas.dto.Application;
import com.pro.uas.service.UniversityServiceJPAImpl;

@Controller
@RequestMapping(value= "/stud")
public class AddApplication {

	@Autowired
	UniversityServiceJPAImpl services;


	@GetMapping("/createapplication")
	public ModelAndView applyApplication(ModelAndView mv) {
		mv.setViewName("Application");
		return mv;
	}

	@RequestMapping(value="/createapplication", method=RequestMethod.POST)
	public ModelAndView applyApplication( HttpServletRequest req, ModelAndView mv) {
		mv.setViewName("Success");
		Application ap = new Application();
		String name =  req.getParameter("fullName");
		String dateofbirth =  req.getParameter("dateOfBirth");
		String qualification =  req.getParameter("hishestQualification");
		int marks = Integer.parseInt(req.getParameter("marksObtained"));
		String goals =  req.getParameter("goals");
		String emailid = req.getParameter("emailId");
		int schprogramid = Integer.parseInt(req.getParameter("schProgramId"));
		String  status = req.getParameter("Married_status");
		
	    
		
		ap.setFullName(name);
		ap.setDateOfBirth(dateofbirth);
		ap.setHishestQualification(qualification);
		ap.setMarksObtained(marks);
		ap.setGoals(goals);
		ap.setEmailId(emailid);
		ap.setSchProgramId(schprogramid);
		ap.setStatus(status);
		
		
		boolean state = services.applyApplication(ap);
		String msg = "Failed to apply for program Data";
		if(state) {
			msg = "Succesfully applied for the program. You will get your application id after 24 hours "
					+ "by going through 'http://localhost:8080/UniversityAdmissionSystem/getapplicationid/participantidlist'  "
					+ "& you can track your application status & interview date through these url ";
		}
		mv.addObject("Success",msg);
		return mv;
	}
}

