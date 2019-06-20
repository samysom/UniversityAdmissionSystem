package com.pro.uas.controller;


import java.io.IOException;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pro.uas.dto.Application;
import com.pro.uas.dto.ProgramsOffered;
import com.pro.uas.service.UniversityServiceImpl;

@WebServlet("/application")
public class ApplicationController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		Application ap = new Application();
		UniversityServiceImpl impl = new UniversityServiceImpl();
		int id = Integer.parseInt(req.getParameter("Application_id"));
		String name = req.getParameter("Full_name");
		String dateofbirth = req.getParameter("Date_of_birth");
		String qualification = req.getParameter("Hishest_qualification");
		int marks = Integer.parseInt(req.getParameter("Marks_obtained"));
		String goals= req.getParameter("Goals");
		String emailid= req.getParameter("Email_id");
		int schprogramid = Integer.parseInt(req.getParameter("Scheduled_program_id"));
		String  status= req.getParameter("Status");
		String interviewdate = req.getParameter("Date_of_interview");
		
		
		
		ap.setApplicationId(id);
		ap.setFullName(name);
		ap.setDateOfBirth(dateofbirth);
		ap.setHishestQualification(qualification);
		ap.setMarksObtained(marks);
		ap.setGoals(goals);
		ap.setEmailId(emailid);
		ap.setSchProgramId(schprogramid);
		ap.setStatus(status);
		ap.setInterviewDate(interviewdate);
		
	    boolean result  = impl.applyApplication(ap);
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
