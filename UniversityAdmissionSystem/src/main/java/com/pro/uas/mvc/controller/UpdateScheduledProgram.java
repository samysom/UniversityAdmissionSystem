package com.pro.uas.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.uas.dto.ProgrammsScheduled;
import com.pro.uas.service.UniversityServiceJPAImpl;

@Controller
@RequestMapping(value= "/log")
public class UpdateScheduledProgram {


	@Autowired
	UniversityServiceJPAImpl services;

	@RequestMapping(value= "/updateschpro",method=RequestMethod.GET)
	public ModelAndView getChangeScheduledProgram(ModelAndView mv)
	{
		mv.setViewName("UpdateSchPro");
		return mv;
	}

	@RequestMapping(value="/updateschpro", method=RequestMethod.POST)
	public ModelAndView updateScheduledProgram (@RequestParam("Scheduled_program_id")int id, @RequestParam("programmName") String proname,
			@RequestParam("Location") String location, @RequestParam("Start_Date") String sdate,
			@RequestParam("End_date")String edate,@RequestParam("Sessions_per_week")int sessions, ModelAndView mv) {

		mv.setViewName("Success");

		ProgrammsScheduled ps=new ProgrammsScheduled();
		ps.setScheduledProgramId(id);
		ps.setProgrammName(proname);
		ps.setLocation(location);
		ps.setStartDate(sdate);
		ps.setEndDate(edate);
		ps.setSessionsPerWeek(sessions);

		boolean state = services.updateScheduledProgram(ps);
		String msg = "Failed to update scheduled Program Data";
		if(state) {
			msg = "scheduled programm Data updated successfully";
		}
		mv.addObject("Success",msg);
		return mv;

	}
}


