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
<title>Delete the Program</title>
</head>
</head>
<body class="container" background="../resources/image/100.jpg" background-size="cover">
	<div>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="./Home">UniversityAdmissionSystem</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="./">Delete Program</a>
                </li>
                
        </div>
        </nav>
    </div>
		
		</nav>
	</div>
		</nav>
	</div>
    <div class="col-md-auto col-lg-6 col-md-offset-4 form-container mt-4">
        <div class="card-body">
            <div class="form-group">
<form action="./delete" method="post">


<div class="form-group row">
                    <label for="name" class="col-sm-2 col-form-label"><b>Program Name</b></label>
                    <div class="col-sm-8">
                   <input type="text" name="ProgramName" class="form-control">            
                    </div></div>
<br>
<br>
<br>
<input type="submit" name="Submit" class="btn btn-success pull-right">&nbsp &nbsp&nbsp
                   
                     <input type="Reset" name="Reset" class="btn btn-primary pull-right">


</form>
</body>
</html>