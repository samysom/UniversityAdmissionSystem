<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Update the Participant</title>
</head>
<body class="container">
    <div>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="./">UniversityAdmissionSystem</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        
        </nav>
    </div>
    <div class="container card  mt-5">
        <div class="containercard-body">
            <center>
                <h1 class="mt-2 mb-2">Update the Participant</h1>
            </center>
<form action="./updateparticipant" method="post">

<br>
<br>

<div class="form-group row">
                    <label for="name" class="col-sm-2 col-form-label">Enter Roll No</label>
                    <div class="col-sm-10">
                    <input type="number" name="Roll_no" class="form-control">                
                    </div></div>
                    
         <div class="form-group row">
<label for="name" class="col-sm-2 col-form-label">Enter Email Id</label>
                    <div class="col-sm-10">
                    <input type="text" name="Email_id" class="form-control">
                                  
                    </div></div>
                    
                    <div class="form-group row">
<label for="name" class="col-sm-2 col-form-label">Application Id</label>
                    <div class="col-sm-10">
                    <input type="number" name="Application_id" class="form-control">
                         </div></div>

                <div class="form-group row">
<label for="name" class="col-sm-2 col-form-label">Enter Scheduled Program Id</label>
                    <div class="col-sm-10">
                    <input type="number" name="Scheduled_program_id" class="form-control">
  
                         </div></div>
                         
                         <div class="form-group row">
<label for="name" class="col-sm-2 col-form-label">Application Status</label>
                    <div class="col-sm-10">
                    <input type="text" name="Application_Status" class="form-control">                 
                         </div></div>


<br>
<br>
<input type="submit" name="Submit" class="btn btn-success pull-right">&nbsp &nbsp&nbsp
                   
                     <input type="Reset" name="Reset" class="btn btn-primary pull-right">

</form>
</div>
</div>
</body>
</html>