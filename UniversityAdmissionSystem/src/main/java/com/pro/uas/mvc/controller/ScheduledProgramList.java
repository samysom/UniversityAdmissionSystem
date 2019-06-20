package com.pro.uas.mvc.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.pro.uas.dto.ProgrammsScheduled;
import com.pro.uas.service.UniversityServiceJPAImpl;

@Controller
@RequestMapping("/log")
public class ScheduledProgramList {

	
	@Autowired
	UniversityServiceJPAImpl service;


	@RequestMapping(value="/schproglist",method=RequestMethod.GET)
	public ModelAndView getAllApplications(ModelAndView mv)
	{
		mv.setViewName("SchProgramlist");
		return mv;
	}
	@RequestMapping(value="/schproglist", method=RequestMethod.POST)
	public String listAllApplications(ModelAndView mv, 
			@RequestParam("ProgrammName") String name,HttpServletResponse resp,HttpServletRequest req)throws SQLException,IOException {
		
		List<ProgrammsScheduled> list = service.listAllScheduledPrograms(name);
		
		if(list!=null)
		{
			HttpSession session=req.getSession(false);
			session.setAttribute("List", list);
		    return "ListSchedule";
		}
		else {
			return null;
		}
		
		
	}
}



