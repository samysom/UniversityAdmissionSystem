package com.pro.uas.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pro.uas.dto.ProgramsOffered;
import com.pro.uas.service.UniversityServiceImpl;

@WebServlet("/progofferedlist")
public class ProgramOfferedController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		UniversityServiceImpl impl=new UniversityServiceImpl();

		List<ProgramsOffered> lst=impl. listAllPrograms();
		//req.setAttribute("list",lst);



		if(lst!=null)
		{

			out.print(lst);

		}
		else
		{
			out.print("<h1>"+"something went wrong"+"</h1>");
		}

	}

}


