<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Unit List</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
	<form action = "unitNavigationServlet" method = "post">
	<table class="table table-dark table-striped">
		<thead>
			<tr>
				<th>select</th>
				<th>Name</th>
				<th>Level</th>
				<th>Health</th>
				<th>Strength</th>
				<th>Magic</th>
				<th>Skill</th>
				<th>Special</th>
				<th>Luck</th>
				<th>Defense</th>
				<th>Resistance</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.allUnits}" var="currentUnit">
				<tr>
					<td>
						<input type="radio" name="id" value="${currentUnit.id}">
					</td>
					<td>${currentUnit.unitName} - </td>
					<td>${currentUnit.level}</td>
					<td>${currentUnit.hitPoints}</td>
					<td>${currentUnit.strength}</td>
					<td>${currentUnit.magic}</td>
					<td>${currentUnit.skill}</td>
					<td>${currentUnit.sp}</td>
					<td>${currentUnit.luck}</td>
					<td>${currentUnit.defense}</td>
					<td>${currentUnit.resistence}</td>
				</tr>
				<c:forEach items="${currentUnit.listOfWeapons}" var="currentWeapon">
					<tr>
						<td>${currentWeapon.weaponName}</td>
					</tr>
				</c:forEach>
			</c:forEach>
		</tbody>
	
	</table>
	<input type = "submit" class="btn btn-primary" value = "edit" name="doThisToUnit">
	<input type = "submit" class="btn btn-warning" value = "delete" name="doThisToUnit">
	<input type = "submit" class="btn btn-primary" value = "add" name = "doThisToUnit">
	</form>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>