package com.pro.uas.jsp.controller;

import javax.servlet.http.HttpServlet;
	
	import java.io.IOException;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	@WebServlet("/proUpdate")
	public class UpdateProgram extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			RequestDispatcher dis = req.getRequestDispatcher("/WEB-INF/views/updatepro.jsp");
			dis.forward(req,resp);

		}

	}


