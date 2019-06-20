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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pro.uas.dto.Application;
import com.pro.uas.service.UniversityServiceJPAImpl;

@Controller
@RequestMapping("/log")
public class Applicationlist<listAllApplications> {
	
	@Autowired
	UniversityServiceJPAImpl service;
	
	
	@RequestMapping(value="/applictn",method=RequestMethod.GET)
	public ModelAndView getFundTransferPage(ModelAndView mv)
	{
		mv.setViewName("Applicationlist");
		return mv;
	}
	@RequestMapping(value="/applictn", method=RequestMethod.POST)

	public String listAllApplications(@RequestParam("Scheduled_program_id") int id,HttpServletResponse resp, HttpServletRequest req) throws SQLException,IOException{
		
		ModelAndView mv=new ModelAndView();
		
		
		
		List<Application> list = service.listAllApplications(id);
		
		if(list!=null) {
			
			HttpSession session=req.getSession(false);
			session.setAttribute("List", list);
			
			return "ListApplication";
		}
		else {
			return null;		
		}
		
	}
}

