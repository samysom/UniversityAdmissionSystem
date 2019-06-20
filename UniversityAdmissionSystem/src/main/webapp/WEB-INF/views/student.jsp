<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Welcome Student</title>
</head>
<style>

.example_e {
border: none;
background: #404040;
color: #ffffff !important;
font-weight: 100;
padding: 20px 10px 20px 10px;
text-transform: uppercase;
border-radius: 50px;

}

.example_e:hover {
color: #404040 !important;
font-weight: 100 !important;
letter-spacing: 3px;
background: none;
-webkit-box-shadow: 0px 5px 4px 0px rgba(0,0,0,0.57);
-moz-box-shadow: 0px 5px 4px 0px rgba(0,0,0,0.57);
transition: all 0.3s ease 0s;
}
    .container {
    
    background-size:cover;
   
    
    }
    
    .container card {
    
   size:50px;
   
    
    }
    
    
</style>

<body class="container" background="../resources/image/tt.jpg" background-size="cover"  >
	<div>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="./log">UniversityAdmissionSystem</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="./">Student Page</a>
                </li>
                </ul>
        </div>
        </nav>
    </div>
		
		</nav>
	</div>
	
	<form action="./student" method="get">
	
	
<br>

<div class="card" style="width: 30rem;">
  <div class="card-header">
    Program Offered
  </div>
  <li class="list-group-item">1.Mechanical Engineering    &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<a class="btn btn-primary" href="./createapplication" >Apply</a></li>
    <li class="list-group-item">2.Computer Science and Engineering &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<a class="btn btn-primary" href="./createapplication" >Apply</a></li>
    <li class="list-group-item">3.Information Technology &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<a class="btn btn-primary" href="./createapplication" >Apply</a></li>
    <li class="list-group-item">4.Civil Engineering  &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<a class="btn btn-primary" href="./createapplication" >Apply</a></li>
    <li class="list-group-item">5.Electronics and Communication Engineering &nbsp &nbsp &nbsp &nbsp<a class="btn btn-primary" href="./createapplication" >Apply</a></li>
    <li class="list-group-item">6.Electrical Engineering&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<a class="btn btn-primary" href="./createapplication" >Apply</a></li>
       <li class="list-group-item">7.Petroleum Engineering &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<a class="btn btn-primary" href="./createapplication" >Apply</a></li>
           <li class="list-group-item">8.Chemical Engineering &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<a class="btn btn-primary" href="./createapplication" >Apply</a></li>
    <li class="list-group-item">9.Marine Engineering &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<a class="btn btn-primary" href="./createapplication" >Apply</a></li>
    <li class="list-group-item">10.Industrial Engineering &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<a class="btn btn-primary" href="./createapplication" >Apply</a></li>
    <li class="list-group-item">11.Aeronautical Engineering &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp<a class="btn btn-primary" href="./createapplication" >Apply</a></li>
  </ul>
  
</div>
</form>
</body>
</html>