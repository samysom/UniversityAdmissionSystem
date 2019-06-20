package com.pro.uas.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pro.uas.dao.UniversityDAOJDBCImpl;
import com.pro.uas.dto.Application;

import com.pro.uas.service.UniversityServiceImpl;

@WebServlet("/updateapp")
public class UpdateApplictaionController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		resp.setContentType("text/html");
		Application ap = new Application();
		UniversityServiceImpl impl = new UniversityServiceImpl();
		
		
		String  status= req.getParameter("Status");
		String interviewdate = req.getParameter("Date_of_interview");
		int id = Integer.parseInt(req.getParameter("Application_id"));


		
		ap.setStatus(status);
		ap.setInterviewDate(interviewdate);
		ap.setApplicationId(id);

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
