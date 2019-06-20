package com.pro.uas.controller;

import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pro.uas.dto.ProgrammsScheduled;
import com.pro.uas.service.UniversityServiceImpl;

@WebServlet("/sch")
public class AddSchProgramController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
    

		resp.setContentType("text/html");
		ProgrammsScheduled ps = new ProgrammsScheduled();
		UniversityServiceImpl impl = new UniversityServiceImpl();
			  
		int Scheduled_program_id = Integer.parseInt(req.getParameter("Scheduled_program_id"));
		String ProgrammName = req.getParameter("ProgrammName");
		String Location = req.getParameter("Location");
		String Start_Date = req.getParameter("Start_Date");
		String End_Date = req.getParameter("End_date");
		int Sessions_per_week= Integer.parseInt(req.getParameter("Sessions_per_week"));
		
		
		ps.setScheduledProgramId(Scheduled_program_id);
		ps.setProgrammName(ProgrammName);
		ps.setLocation(Location);
		ps.setStartDate(Start_Date);
		ps.setEndDate(End_Date);
		ps.setSessionsPerWeek(Sessions_per_week);
		
	    boolean result  = impl.createScheduledProgram(ps);
	    System.out.println("kkkkkk");
		if(result)
		{
			System.out.println("jjjjj");
		resp.sendRedirect("Success.jsp");
		}
		else
		{
			resp.sendRedirect("Failed.jsp");
		}
     
	}
	
	}

	
