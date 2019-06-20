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
import org.springframework.web.servlet.ModelAndView;

import com.pro.uas.dto.Participant;
import com.pro.uas.service.UniversityServiceJPAImpl;

@Controller
@RequestMapping(value= "/log")
public class Participantlist {
	
	@Autowired
	UniversityServiceJPAImpl service;


	@RequestMapping(value="/participantlist",method=RequestMethod.GET)
	public ModelAndView getParticipantlist(ModelAndView mv)
	{
		mv.setViewName("Participantlist");
		return mv;
	}
	@RequestMapping(value="/participantlist", method=RequestMethod.POST)
	public String listAllParticipant(ModelAndView mv, 
			Participant p,HttpServletResponse resp, HttpServletRequest req) throws SQLException,IOException {
		
		List<Participant> list = service.listAllParticipant();
              if(list!=null) {
			
			HttpSession session=req.getSession(false);
			session.setAttribute("List", list);
		
			return "ListParticipant";
}
		
else {
	return null;
}
	}
}




