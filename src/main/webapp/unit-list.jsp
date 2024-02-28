<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Unit List</title>
</head>
<body>
	<form action = "unitNavigationServlet" method = "post">
	<table>
	<c:forEach items="${requestScope.allUnits}" var="currentUnit">
		<tr>
			<td><input type="radio" name="id" value="${currentUnit.id}"></td>
			<td>${currentUnit.unitName} - </td>
			<td>lv: ${currentUnit.level}</td>
			<td>HP: ${currentUnit.hitPoints}</td>
			<td>Str: ${currentUnit.strength}</td>
			<td>Mag: ${currentUnit.magic}</td>
			<td>Skill: ${currentUnit.skill}</td>
			<td>Sp: ${currentUnit.sp}</td>
			<td>Lck: ${currentUnit.luck}</td>
			<td>Def: ${currentUnit.defense}</td>
			<td>Res: ${currentUnit.resistence}</td>
		</tr>
		<c:forEach items="${currentUnit.listOfWeapons}" var="currentWeapon">
			<tr>
				<td>${currentWeapon.weaponName}</td>
			</tr>
		</c:forEach>
	</c:forEach>
	</table>
	<input type = "submit" value = "edit" name="doThisToUnit">
	<input type = "submit" value = "delete" name="doThisToUnit">
	<input type = "submit" value = "add" name = "doThisToUnit">
	</form>
</body>
</html>