<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>ApplicationId</title>
</head>ss
<style>
.container {
	background-size: cover;
}
</style>

<body class="container" background="./resources/image/1.jpg" background-size="cover">
	<div>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark"> <a
			class="navbar-brand" href="./logs">UniversityAdmissionSystem</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		</nav>
	</div>
	<div class="col-md-auto col-lg-6 col-md-offset-4 form-container mt-4">
		<div class="card-body">
			<div class="form-group">

				<form action="./partlist" method="post">

					<div class="form-group row">
						<label for="name" class="col-sm-2 col-form-label">Email Id</label>
						<div class="col-sm-10">
							<input type="email" name="Email_id"
								class="form-control">

						</div>
					</div>
					<input type="submit" value="list"
						class="btn btn-success pull-right">&nbsp &nbsp&nbsp <input
						type="submit" value="Reset" class="btn btn-primary pull-right">


				</form>
			</div>
		</div>
	</div>

</body>
</html>