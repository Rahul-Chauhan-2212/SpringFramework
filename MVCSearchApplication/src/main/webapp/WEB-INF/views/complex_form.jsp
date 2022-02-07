<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
	crossorigin="anonymous">

<title>Student Registration Form</title>
</head>
<body class="" style="background: teal;">

	<div class="container mt-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Student Registration Form</h3>
						<form action="handle" method="post">
							<div class="form-group">
								<label for="email">Email address</label> <input type="email"
									class="form-control" name="email" id="email"
									aria-describedby="emailHelp" placeholder="Enter email">
								<small id="emailHelp" class="form-text text-muted">We'll
									never share your email with anyone else.</small>
							</div>
							<div class="form-group">
								<label for="name">Full Name</label> <input type="text"
									class="form-control" name="name" id="name"
									placeholder="Enter Your Full Name" />
							</div>
							<div class="form-group">
								<label for="dob">Date of Birth</label> <input type="date"
									class="form-control" name="dob" id="dob"
									aria-describedby="dobHelp" /> <small id="dobHelp"
									class="form-text text-muted">Enter your DOB</small>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" name="gender"
									id="gender1" value="Male" checked> <label
									class="form-check-label" for="gender1"> Male</label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" name="gender"
									id="gender2" value="Female"> <label
									class="form-check-label" for="gender2"> Female</label>
							</div>
							<div class="form-group">
								<label for="languages">Select the Languages known</label> <select
									multiple class="form-control" id="languages" name="languages">
									<option>C++</option>
									<option>Java</option>
									<option>Python</option>
									<option>HTML</option>
									<option>JavaScript</option>
								</select>
							</div>
							<div class="form-group">
								<label for="type">Student Type</label> <select id="type"
									name="type" class="form-control">
									<option selected>New Student</option>
									<option>Old Student</option>
								</select>
							</div>
							<div class="container text-center">
								<button type="submit" class="btn btn-primary btn-center">Register</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" integrity="sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2" crossorigin="anonymous"></script>
    -->
</body>
</html>