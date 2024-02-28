<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Unit</title>
</head>
<body>
	<form action="addUnitServlet" method="post">
		Name: <input type="text" name="unitName">
		Level: <input type="number" name="level" min="0" value="0">
		Hitpoints: <input type="number" name="hitpoints" min="0" value="0">
		Strength: <input type="number" name="strength" min="0" value="0">
		Magic: <input type="number" name="magic" min="0" value="0">
		Skill: <input type="number" name="skill" min="0" value="0">
		SP: <input type="number" name="sp" min="0" value="0">
		Luck: <input type="number" name="luck" min="0" value="0">
		Defense: <input type="number" name="defense" min="0" value="0">
		Resistence: <input type="number" name="resistence" min="0" value="0">
		<select name="allWeaponsToAdd" multiple size="6">
			<c:forEach items="${requestScope.allWeapons}" var="currentWeapon">
				<option value="${currentWeapon.id}">${currentWeapon.weaponName}</option>
			</c:forEach>
		</select>
		<input type="submit" value="Add Item">
	</form> <br />

	<a href="unit-menu.html">Back</a>
</body>
</body>
</html>