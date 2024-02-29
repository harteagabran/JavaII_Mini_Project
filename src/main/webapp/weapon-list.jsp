<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weapon List</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
	<form action = "weaponNavigationServlet" method = "post">
	<table class="table table-dark">
		<thead>
			<tr>
				<th>select</th>
				<th>Weapon</th>
				<th>Mastery</th>
				<th>Endurance</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.allWeapons}" var="currentWeapon">
				<tr>
					<td><input type="radio" name="id" value="${currentWeapon.id}"></td>
					<td>${currentWeapon.weaponName} - </td>
					<td>${currentWeapon.mastery}</td>
					<td>${currentWeapon.endurance}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<input type = "submit" class="btn btn-primary" value = "edit" name="doThisToWeapon">
	<input type = "submit" class="btn btn-warning" value = "delete" name="doThisToWeapon">
	<input type = "submit" class="btn btn-primary" value = "add" name = "doThisToWeapon">
	</form>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>