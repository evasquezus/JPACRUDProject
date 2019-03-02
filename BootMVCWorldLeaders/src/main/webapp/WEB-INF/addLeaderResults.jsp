<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Leader</title>
</head>
<body>

	<h1>Add Leader</h1>
	ID:
	<h1>${leaderID.id}</h1>
	<br>

	<ul class="list-group list-group-flush">
		<li class="list-group-item"><p>First Name :${leaderID.firstName}</p></li>
		<li class="list-group-item"><p>Last Name : ${leaderID.lastName}</p></li>
		<li class="list-group-item"><p>Gender : ${leaderID.gender}</p></li>
		<li class="list-group-item"><p>Country : ${leaderID.country}</p></li>
		<li class="list-group-item"><p>Date of Birth :${leaderID.dateOfBirth}</p></li>
		<li class="list-group-item"><p>Birth Place :${leaderID.birthPlace}</p></li>
	</ul>
</body>
</html>