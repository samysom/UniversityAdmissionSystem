package com.pro.uas.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pro.uas.dto.Application;
import com.pro.uas.service.UniversityServiceImpl;

@WebServlet("/applictnlist")
public class ListApplicationController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		UniversityServiceImpl impl=new UniversityServiceImpl();
		List<Application> lst2=impl.listAllApplications(0);
		 
		if(lst2!=null)
	{
			 out.print("<h1>"+"Application details"+"</h1>");
	 			out.println(lst2);		 
	}
		else
 		{
 			out.print("<h1>"+"something went wrong"+"</h1>");
 		}
	}
}



