<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Leader By ID</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link href="../css/myStyles.css" rel="stylesheet" type="text/css">
</head>

<body>
	<nav class="navbar sticky-top navbar-light bg-light" id="navbar">
		<a href="WEB-INF/index.jsp">Home</a> <a href="WEB-INF/index.jsp">DisplayAll</a>
	</nav>
	<Strong><h1>Displaying Results</h1></Strong>
	<br>
	<div class="card" style="width: 18rem;">
		<img class="card-img-top"
			src="https://i.ytimg.com/vi/LbI5gCZq_SY/maxresdefault.jpg"
			alt="leaderImage">

		<ul class="list-group list-group-flush">
			<li class="list-group-item"><p>First Name :
					${leader.firstName}</p></li>
			<li class="list-group-item"><p>Last Name :
					${leader.lastName}</p></li>
			<li class="list-group-item"><p>Gender : ${leader.gender}</p></li>
			<li class="list-group-item"><p>Country : ${leader.country}</p></li>
			<li class="list-group-item"><p>Date of Birth :
					${leader.dateOfBirth}</p></li>
			<li class="list-group-item"><p>Birth Place :
					${leader.birthPlace}</p></li>
		</ul>

		<h3>Edit this leader?</h3>
		<input type="hidden" name="leaderID" value="${leader.id}" />
		<form action="editLeader.do" method="POST" name="leaderID">
			<p>

				First Name: <input type="text" name="firstName"> <br>
				Last Name: <input type="text" name="lastName"> <br>
				Gender: <input type="text" name="gender"> <br> Country:
				<input type="text" name="country"> <br> Date of Birth:
				<input type="text" name="dateOfBirth"> <br> Birth
				Place: <input type="text" name="birthPlace"> <br> <input
					type="hidden" name="leaderID" value="${leader.id}" /> <input
					type="hidden" name="leaderID" value="${leader.id}" /> <br> <input
					type="submit" value="Edit Leader" /> <br>
		</form>
		</p>
		</form>

		<h3>Delete a leader?</h3>
		<form action="deleteLeader.do" method="POST" name="leaderID">
			<input type="text" name="leaderID" value="Provide an ID" /> <input
				type="submit" name="filmID" value="Delete Leader" />
		</form>

		<h3>Add new leader?</h3>
		<form action="addLeader.do" method="POST" name="leaderID">
			First Name: <input type="text" name="firstName"> <br>
			Last Name: <input type="text" name="lastName"> <br>
			Gender: <input type="text" name="gender"> <br> Country:
			<input type="text" name="country"> <br> Date of Birth: <input
				type="text" name="dateOfBirth"> <br> Birth Place: <input
				type="text" name="birthPlace"> <br> <input
				type="hidden" name="leaderID" value="${leader.id}" /> <input
				type="submit" name="filmID" value="Add Leader" />
		</form>
	</div>

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
</body>
</html>


