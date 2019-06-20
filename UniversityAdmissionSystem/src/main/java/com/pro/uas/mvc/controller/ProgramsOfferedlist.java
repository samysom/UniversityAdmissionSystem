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


import com.pro.uas.dto.ProgramsOffered;
import com.pro.uas.service.UniversityServiceJPAImpl;

@Controller
@RequestMapping("/log")
public class ProgramsOfferedlist {


	@Autowired
	UniversityServiceJPAImpl service;


	@RequestMapping(value="/proglist",method=RequestMethod.GET)
	public ModelAndView getProgramslist(ModelAndView mv)
	{
		mv.setViewName("programlist");
		return mv;
	}
	@RequestMapping(value="/proglist", method=RequestMethod.POST)
	public String listAllPrograms(ModelAndView mv, 
			ProgramsOffered po,HttpServletResponse resp,HttpServletRequest req)throws SQLException,IOException {
		
		List<ProgramsOffered> list = service.listAllPrograms();
		if(list!=null)
		{
			HttpSession session=req.getSession(false);
			session.setAttribute("List", list);
			return "ListProgram";
		}
		else {
			return null;
		}
		
		
		
	}
}


