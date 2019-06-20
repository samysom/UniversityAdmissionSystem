
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Registration</title>
</head>
<body class="containerz">
    <div>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="./logs">UniversityAdmissionSystem</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        
        </nav>
    </div>
    <div class="container card  mt-5">
        <div class="containercard-body">
            <center>
                <h1 class="mt-2 mb-2">Fill Your Details</h1>
            </center>
            <form action="./createapplication" method="post" >
             
                 <div class="form-group row">
                    <label for="name" class="col-sm-2 col-form-label">Enter Full Name</label>
                    <div class="col-sm-5">
                    <input type="text" name="fullName"  class="form-control"  placeholder="eg: Serge Kampf">
                       
                    </div></div>
                    
                <div class="form-group row">
                    <label for="dob" class="col-sm-2 col-form-label">Enter Date of Brith</label>                
                    <div class="col-sm-5">
                    <input type="date" name="dateOfBirth"  class="form-control">
                       
                    </div>
                </div>
                <div class="form-group row">
                    <label for="highest_qualification" class="col-sm-2 col-form-label">Highest Qualification</label>                
                    <div class="col-sm-5">
                    <input type="text" name="hishestQualification"  class="form-control" placeholder="eg: B.Tech">
                         
                    </div>
                </div>
                <div class="form-group row">
                    <label for="highest_qualification" class="col-sm-2 col-form-label">Enter Marks Obtained</label>                
                    <div class="col-sm-5">
                    <input type="text" name="marksObtained"  class="form-control" type="number" step="any" required maxlength="4" placeholder="60.00">
                         
                    </div>
                </div>
                
                 <div class="form-group row">
                    <label for="dob" class="col-sm-2 col-form-label">Enter Goals</label>                
                    <div class="col-sm-5">
                    <input type="text" name="goals"class="form-control"  placeholder="JFSD">
                      
                    </div>
                </div>
               
                <div class="form-group row">
                    <label for="email" class="col-sm-2 col-form-label">Your Email ID</label>
                    <div class="col-sm-5">
                        <input type="text" name="emailId" class="form-control" id="email" placeholder="eg: jonam@domain.com" required>
                    </div>
                </div>
                
               
                
                <div class="form-group row">
                    <label for="proId" class="col-sm-2 col-form-label">Enter Program Id</label>                
                    <div class="col-sm-5">
						<input type="number" name="schProgramId" class="form-control" placeholder="eg:123" required >
                           
					
					</div>
                </div>
                
                
                <div class="form-group row">
                    <label for="dob" class="col-sm-2 col-form-label">Enter Status</label>                
                    <div class="col-sm-5">
                    <input type="text" name="Married_status" class="form-control" placeholder="eg: student">
                  
                    </div>
                </div>
                
                <div class="form-group row">
                    <label for="dob" class="col-sm-2 col-form-label"> Date of Interview</label>                
                    <div class="col-sm-5">
                    <input type="date" name="interviewDate" class="form-control">
                    
                       
                    </div>
                </div>
                <div class="form-group float-right">
                    <button type="submit" class="btn btn-success">Submit</button>
                </div>
                
                                     
               
            </form>                   
        </div>
    </div>
    
    </body>
</html>