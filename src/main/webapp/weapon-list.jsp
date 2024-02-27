<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weapon List</title>
</head>
<body>
	<form action = "weaponNavigationServlet" method = "post">
	<table>
	<c:forEach items="${requestScope.allWeapons}" var="currentWeapon">
	<tr>
		<td><input type="radio" name="id" value="${currentWeapon.id}"></td>
		<td>${currentWeapon.weaponName} - </td>
		<td>Mastery: ${currentWeapon.mastery}</td>
		<td>Endurance: ${currentWeapon.endurance}</td>
	</tr>
	</c:forEach>
	</table>
	<input type = "submit" value = "edit" name="doThisToWeapon">
	<input type = "submit" value = "delete" name="doThisToWeapon">
	<input type = "submit" value = "add" name = "doThisToWeapon">
	</form>
</body>
</html>