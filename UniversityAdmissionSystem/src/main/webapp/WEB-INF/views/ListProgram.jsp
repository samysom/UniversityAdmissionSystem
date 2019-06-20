<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.pro.uas.dto.ProgramsOffered"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

	List<ProgramsOffered> li=(List<ProgramsOffered>) session.getAttribute("List");
    ProgramsOffered app=new ProgramsOffered();
	
	
	%>	
		<style>
		table{
		
		border: solid; color: black;
		}
		
		</style>
		<center><h1><b>Program Offered Details are Below:</b></h1></center>
		
		
	<table cellpadding="10" cellspacing="5" border="2" bgcolor="cyan" align="center">
	
	<tr>
	<th>ProgramName</th>
	<th>Description</th>
	<th>Applicant_eligibility</th>
	<th>Duration</th>
	<th>Degree_certificate_offered</th>
	
	</tr>
	
	<%
	  for(int i=0;i<li.size();i++)
	  {
		 app= li.get(i);
	 
	%>
	
	<tr>
	<td><%= app.getProgramName() %></td>
	<td><%= app.getDescription() %></td>
	<td><%= app.getEligibility() %></td>
	<td><%= app.getDuration() %></td>
	<td><%= app.getDegreecertificateOffered() %></td>
	
	
	</tr>
	<%
	  }
	%>
	
	</table>	
		
		
</body>
</html>