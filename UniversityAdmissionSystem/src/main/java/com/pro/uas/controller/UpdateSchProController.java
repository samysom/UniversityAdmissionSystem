package com.pro.uas.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pro.uas.dao.UniversityDAOJDBCImpl;
import com.pro.uas.dto.ProgrammsScheduled;
@WebServlet("/updateschpro")
public class UpdateSchProController extends HttpServlet{ 

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			resp.setContentType("text/html");
			UniversityDAOJDBCImpl impl = new UniversityDAOJDBCImpl();
			ProgrammsScheduled ps = new ProgrammsScheduled();
			String progid = req.getParameter("schprogid");
			int programid = Integer.parseInt(progid);
			String progname = req.getParameter("programname");
			String loc = req.getParameter("location");
			String std = req.getParameter("startdate");
			String etd = req.getParameter("enddate");
			String spw = req.getParameter("sessperweek");
			int secc1= Integer.parseInt(spw);

			ps.setProgrammName(progname);

			try {
				SimpleDateFormat std1 = new SimpleDateFormat("yyyy-mm-dd");
				java.util.Date date1=std1.parse(std);
				java.sql.Date date=new java.sql.Date(date1.getTime());
				java.util.Date date2=std1.parse(etd);
				java.sql.Date date3=new java.sql.Date(date2.getTime());
				ps.setScheduledProgramId(programid);
				ps.setProgrammName(progname);
				ps.setStartDate(std);
				ps.setLocation(loc);
				ps.setEndDate(etd);
				ps.setSessionsPerWeek(secc1);

				boolean result = impl.updateScheduledProgram(ps);
				if(result)
				{
					resp.sendRedirect("./Success.jsp");
				}
				else
				{
					resp.sendRedirect("./Failed.jsp");
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}
	}
}
