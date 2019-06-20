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

import com.pro.uas.dto.Participant;
import com.pro.uas.service.UniversityServiceJPAImpl;

@Controller
@RequestMapping(value= "/getapplicationid")
public class ParticipantIdList {
	
	
	@Autowired
	UniversityServiceJPAImpl service;


	@RequestMapping(value="/participantidlist",method=RequestMethod.GET)
	public ModelAndView getlistParticipant(ModelAndView mv)
	{
		mv.setViewName("getapplicationid");
		return mv;
	}
	@RequestMapping(value="/participantidlist", method=RequestMethod.POST)
	public String listParticipant(ModelAndView mv, 
			@RequestParam("emailId") String emailId,HttpServletResponse resp, HttpServletRequest req) throws SQLException,IOException {
		
		List<Participant> list = service.listParticipant(emailId);
		
		  if(list!=null) {
				
				HttpSession session=req.getSession(false);
				session.setAttribute("List", list);
			
				return "ListParticipantId";
	}
			
	else {
		return null;
	}
	}
}



