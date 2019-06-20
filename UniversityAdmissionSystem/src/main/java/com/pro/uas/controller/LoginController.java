package com.pro.uas.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pro.uas.dto.Users;
import com.pro.uas.service.UniversityServiceImpl;

@WebServlet("/loginpage")
public class LoginController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		String Loginid = req.getParameter("Login_id");
		String Password = req.getParameter("Password");
		String Role = req.getParameter("Role");
		
		UniversityServiceImpl service = new UniversityServiceImpl();
		
		Users us = service.login(Loginid, Password,Role);
		
		if(us != null) {
			//Login Successful
			HttpSession session = req.getSession();
			if (us.getRole().equals("Admin")) {
				session.setAttribute("Admin", us);
				resp.sendRedirect("./Homepage.jsp");	
			}else if (us.getRole().equals("MAC")) {
				session.setAttribute("MAC", us);
				resp.sendRedirect("./HomeMAC.jsp");
			}
		}else {
			//Login Failed
			resp.sendRedirect("./Login.jsp");
		}
	}
}


