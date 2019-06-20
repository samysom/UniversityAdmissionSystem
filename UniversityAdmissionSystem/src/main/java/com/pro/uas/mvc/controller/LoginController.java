package com.pro.uas.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.uas.dto.Users;
import com.pro.uas.service.UniversityServiceJPAImpl;

@Controller
@RequestMapping(value= "/log")
public class LoginController {

	@Autowired
	UniversityServiceJPAImpl service;

	@RequestMapping(value="/loginpage",method=RequestMethod.GET)
	public String getLoginPage()
	{
		return "Login";
	}

	@RequestMapping(value= "/loginpage",method=RequestMethod.POST)
	public ModelAndView login(@RequestParam("loginId")String loginId,@RequestParam("password")String password,
			@RequestParam("role")String role,HttpServletRequest req,HttpServletResponse resp,ModelAndView mv,Model model)

		{
			Users user=service.login(loginId, password, role);
			
			if(user==null)
			{
				mv.setViewName("Login");
			}
			if(user!=null)
			{
				HttpSession session = req.getSession();
				if (user.getRole().equals("Admin"))
				{
					mv.addObject("Admin", user);
					mv.setViewName("/Homepage");
				}
				else if (user.getRole().equals("MAC"))
				{
					mv.addObject("MAC",user);
					mv.setViewName("HomeMAC");
				}

			}
			
		return mv;
	}
}
			