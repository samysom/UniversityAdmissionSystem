<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.pro.uas.dto.Participant"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%

	List<Participant> li=(List<Participant>) session.getAttribute("List");
	Participant app=new Participant();
	
	
	%>	
		<style>
		table{
		
		border: solid; color:black;
		}
		
		</style>
	<center><h1><b>Candidate Details are Below:</b></h1></center>	
		
		
	<table cellpadding="10" cellspacing="5" border="2" align="center" bgcolor="silver">
	
	<tr>
	<th><h3>Roll_no</h3></th>
	<th><h3>Email_id</h3></th>
	<th><h3>Application_id</h3></th>
	<th><h3>Scheduled_program_id</h3></th>
	<th><h3>Application_Status</h3></th>
	
	
	</tr>
	
	<%
	  for(int i=0;i<li.size();i++)
	  {
		 app= li.get(i);
	 
	%>
	
	<tr>
	<td><%= app.getRollNo() %></td> 
	<td><%= app.getEmailId() %></td>
	<td><%= app.getApplicationId() %></td>
	<td><%= app.getProgrammId() %></td>
	<td><%= app.getApplicationStatus() %></td>
	
	
	
	</tr>
	<%
	  }
	%>
	
	</table>	
</body>
</html>