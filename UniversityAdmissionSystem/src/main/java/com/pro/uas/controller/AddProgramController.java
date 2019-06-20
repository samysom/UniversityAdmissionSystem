package com.pro.uas.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pro.uas.dto.ProgramsOffered;
import com.pro.uas.service.UniversityServiceImpl;

@WebServlet("/add")
public class AddProgramController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      

		resp.setContentType("text/html");
		ProgramsOffered po = new ProgramsOffered();
		UniversityServiceImpl impl = new UniversityServiceImpl();
		String name = req.getParameter("ProgramName");
		String desp = req.getParameter("Description");
		String eligibility = req.getParameter("Applicant_eligibility");
		int duration = Integer.parseInt(req.getParameter("Duration"));
		String degreeoffered = req.getParameter("Degree_certificate_offered");
		
		
		po.setProgramName(name);
		po.setDescription(desp);
		po.setEligibility(eligibility);
		po.setDuration(duration);
		po.setDegreecertificateOffered(degreeoffered);
		
	    boolean result  = impl.addProgramOffered(po);
		if(result)
		{
		resp.sendRedirect("Success.jsp");
		}
		else
		{
			resp.sendRedirect("Failed.jsp");
		}
		
	}
	
	}
