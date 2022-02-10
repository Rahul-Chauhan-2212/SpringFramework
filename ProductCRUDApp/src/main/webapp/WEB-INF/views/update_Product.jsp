<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Update Product</title>
</head>
<body>
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card" style="background-color: silver;">
					<div class="card-body">
						<h1 class="text-center">Update Product Form</h1>
						<form action="/ProductCRUDApp/saveOrUpdate" method="post">
							<div class="form-group">
								<input type="hidden" class="form-control" id="id" name="id"
									placeholder="Enter Product Id" value="${product.id}">
							</div>
							<div class="form-group">
								<label for="name">Name</label> <input type="text"
									class="form-control" id="name" name="name"
									placeholder="Enter Product Name" value="${product.name}">
							</div>
							<div class="form-group">
								<label for="description">Description</label> <input type="text"
									class="form-control" id="description" name="description"
									placeholder="Enter Product Description"
									value="${product.description}">
							</div>
							<div class="form-group">
								<label for="price">Price</label> <input type="text"
									class="form-control" id="price" name="price"
									placeholder="Enter Product Name" value="${product.price}">
							</div>
							<div class="container text-center">
								<a href="${pageContext.request.contextPath}/"
									class="btn btn-outline-danger">Back</a>
								<button type="submit" class="btn btn-primary btn-center">Update</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>