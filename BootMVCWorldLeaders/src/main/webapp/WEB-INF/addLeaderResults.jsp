<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Leader</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link href="../css/myStyles.css" rel="stylesheet" type="text/css">
</head>
<body>

	<div class="jumbotron jumbotron-fluid">
		<div class="container">
			<h1 class="display-4">Displaying Add Results</h1>
		</div>
	</div>

	<div class="alert alert-success">
		<strong>Success!</strong> Successful.
	</div>
	
	<table class="table table-hover table-dark">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">First</th>
				<th scope="col">Last</th>
				<th scope="col">Gender</th>
				<th scope="col">Country</th>
				<th scope="col">DOB</th>
				<th scope="col">Birth Place</th>

			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">1</th>
				<td>${leaderID.firstName}</td>
				<td>${leaderID.lastName}</td>
				<td>${leaderID.gender}</td>
				<td>${leaderID.country}</td>
				<td>${leaderID.dateOfBirth}</td>
				<td>${leaderID.birthPlace}</td>
			</tr>
		</tbody>
	</table>


	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
	</ul>
</body>
</html>