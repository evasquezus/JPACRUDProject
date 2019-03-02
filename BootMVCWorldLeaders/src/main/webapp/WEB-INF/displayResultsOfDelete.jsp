<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Displaying results of delete</title>
</head>
<body>

	<c:choose>
		<c:when test="${leaderID}">
			<p>Leader is removed</p>
			<a href="WEB-INF/diplayResults.jsp">return to main menu</a>
		</c:when>
		<c:otherwise>
			<p>No leader found</p>
			<a href="WEB-INF/diplayResults.jsp">return to main menu</a>
		</c:otherwise>
	</c:choose>
</body>
</html>