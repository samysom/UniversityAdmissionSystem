package com.pro.uas.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pro.uas.dao.UniversityDAOJDBCImpl;

@WebServlet("/delete")
public class DeleteProgramController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UniversityDAOJDBCImpl  impl = new UniversityDAOJDBCImpl();
		String name = req.getParameter("ProgramName");
		boolean result = impl.deleteProgramOffered(name);
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
