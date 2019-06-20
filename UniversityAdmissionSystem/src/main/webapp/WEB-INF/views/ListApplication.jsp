<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.pro.uas.dto.Application"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  	
	<%

	List<Application> li=(List<Application>) session.getAttribute("List");
	Application app=new Application();
	
	
	%>	
		<style>
		table{
		
		border: solid; color:black;
		}
		
		</style>
	<center><h1><b>Applicants Details are Below:</b></h1></center>	
		
		
	<table cellpadding="10" cellspacing="5" border="2" align="center" bgcolor="aqua">
	
	<tr>
	<th><h3>applicationId</h3></th>
	<th><h3>fullName</h3></th>
	<th><h3>dateOfBirth</h3></th>
	<th><h3>highestQualification</h3></th>
	<th><h3>marksObtained</h3></th>
	<th><h3>goals</h3></th>
	<th><h3>emailId</h3></th>
	<th><h3>schProgramId</h3></th>
	<th><h3>status</h3></th>
	<th><h3>interviewDate</h3></th>
	
	</tr>
	
	<%
	  for(int i=0;i<li.size();i++)
	  {
		 app= li.get(i);
	 
	%>
	
	<tr>
	<td><%= app.getApplicationId() %></td>
	<td><%= app.getFullName() %></td>
	<td><%= app.getDateOfBirth() %></td>
	<td><%= app.getHishestQualification() %></td>
	<td><%= app.getMarksObtained() %></td>
	<td><%= app.getGoals() %></td>
	<td><%= app.getEmailId() %></td>
	<td><%= app.getSchProgramId() %></td>
	<td><%= app.getStatus() %></td>
	<td><%= app.getInterviewDate() %></td>
	
	</tr>
	<%
	  }
	%>
	
	</table>	
		
		
</body>
</html>