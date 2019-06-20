package com.pro.uas.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pro.uas.dao.UniversityDAOJDBCImpl;
import com.pro.uas.dto.ProgramsOffered;
import com.pro.uas.service.UniversityServiceImpl;

@WebServlet("/update")
public class UpdateprogramController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		UniversityDAOJDBCImpl impl = new UniversityDAOJDBCImpl();
		ProgramsOffered po = new ProgramsOffered();
		
		String Description = req.getParameter("Description");
		String appeli = req.getParameter("Applicant_eligibility");
		String dur = req.getParameter("Duration");
		int durationtime = Integer.parseInt(dur);
		String degreeoffered = req.getParameter("Degree_certificate_offered");
		String programname = req.getParameter("ProgramName");

		po.setDescription(Description);
		po.setEligibility(appeli);
		po.setDuration(durationtime);
		po.setDegreecertificateOffered(degreeoffered);
		po.setProgramName(programname);
	
		
		
		boolean result = impl.updateProgramOffered(po);
		if(result)
		{
			resp.sendRedirect("./Success.jsp");
		}
		else
		{
			resp.sendRedirect("./Failed.jsp");
		}
	

	}
	

}
