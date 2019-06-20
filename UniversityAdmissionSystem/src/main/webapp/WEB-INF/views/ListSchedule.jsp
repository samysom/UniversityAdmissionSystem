<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.pro.uas.dto.ProgrammsScheduled"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

	List<ProgrammsScheduled> li=(List<ProgrammsScheduled>) session.getAttribute("List");
ProgrammsScheduled app=new ProgrammsScheduled();
	
	
	%>	
		<style>
		table{
		
		border: solid; color: black;
		}
		
		</style>
		
		<center><h1><b>Schedule Programs Details are Below:</b></h1></center>
		
	<table cellpadding="10" cellspacing="5" border="2" bgcolor="cyan" align="center">
	
	<tr>
	<th>Scheduled_program_id</th>
	<th>ProgrammName</th>
	<th>Location</th>
	<th>Start_Date</th>
	<th>End_Date</th>
	<th>Sessions_per_week</th>
	</tr>
	
	<%
	  for(int i=0;i<li.size();i++)
	  {
		 app= li.get(i);
	 
	%>
	
	<tr>
	<td><%= app.getScheduledProgramId() %></td>
	<td><%= app.getProgrammName() %></td>
	<td><%= app.getLocation() %></td>
	<td><%= app.getStartDate() %></td>
	<td><%= app.getEndDate() %></td>
	<td><%= app.getSessionsPerWeek() %></td>
	
	</tr>
	<%
	  }
	%>
	
	</table>	
		
</body>
</html>