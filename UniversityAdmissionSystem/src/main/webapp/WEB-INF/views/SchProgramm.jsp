<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<style>
    .container {
    
    background-size:cover;
    
    }
    
    
</style>
<title>SHpgm</title>
</head>
</head>
<body class="container" background="./resources/image/" background-size="cover">
	<div>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="./Home">UniversityAdmissionSystem</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="./">Add Scheduled Program</a>
                </li>
               
        </div>
        </nav>
    </div>
		
		</nav>
	</div>
		</nav>
	</div>
    <div class="container card  mt-5">
        <div class="containercard-body">
            <center>
                <h1 class="mt-2 mb-2">Add Scheduled Program</h1>
            </center>
<form action="./addschprogramm" method="post">

                       <div class="form-group row">
                    <label for="name" class="col-sm-2 col-form-label">Scheduled Program id</label>
                    <div class="col-sm-10">
                    <input type="number" name="ScheduledProgramId" class="form-control" >                
                    </div></div>
                    
                    <div class="form-group row">
                    <label for="name" class="col-sm-2 col-form-label">Program Name</label>
                    <div class="col-sm-10">
                    <input type="text" name="ProgrammName" class="form-control">         
                    </div></div>
                    
                     <div class="form-group row">
                    <label for="name" class="col-sm-2 col-form-label"> Location</label>
                    <div class="col-sm-10">
                    <input type="text" name="Location" class="form-control">        
                    </div></div>
                    
                    
                     <div class="form-group row">
                    <label for="name" class="col-sm-2 col-form-label"> Start Date</label>
                    <div class="col-sm-10">
                     <input type="text" name="StartDate" class="form-control">        
                    </div></div>
                    
                    <div class="form-group row">
                    <label for="name" class="col-sm-2 col-form-label"> End Date</label>
                    <div class="col-sm-10">
                     <input type="text" name="EndDate" class="form-control">        
                    </div></div>
                    
                    <div class="form-group row">
                    <label for="name" class="col-sm-2 col-form-label"> Sessions per week</label>
                    <div class="col-sm-10">
                     <input type="number" name="SessionsPerWeek" class="form-control">        
                    </div></div>


 
 

<br>
<br>
<input type="submit" name="Submit" class="btn btn-success pull-right">&nbsp &nbsp&nbsp
                   
                     <input type="Reset" name="Reset" class="btn btn-primary pull-right">
</form>
</body>
</html>