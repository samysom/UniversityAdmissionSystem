<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
<style>

    .container {
    
    background-size:cover;
    
    }
</style>
<title>Login</title>
</head>
</head>
<body class="container"  background="../resources/image/uni.jpg"   background="cover">
	<div>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="./">UniversityAdmissionSystem</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		
		</nav>
	</div>
    <div class="col-md-auto col-lg-6 col-md-offset-4 form-container mt-4">
        <div class="card-body">
            <div class="form-group">
                <form action="./loginpage" method="post">
                    <center>
                        <h1>Login</h1>
                    </center>
                    <label for="username">Username</label>
                    <input type="text" name="loginId"  class="form-control" required>
                    <label for="password">Password</label>
                   <input type="password" name="password"  class="form-control" required>
                    <label for="Role">Role</label>
       <select class="form-control" name="role" required>
                            <option disabled selected>Choose your role</option>
                            <option value="Admin">Admin</option>
                            <option value="MAC">MAC</option>
                        </select>
                           <br>  
                    
                    <input type="submit" value="Login" class="btn btn-success pull-right">&nbsp &nbsp&nbsp
                   
                     <input type="submit" value="Reset" class="btn btn-primary pull-right">
                </form>
            </div>
        </div>
    </div>

</html>