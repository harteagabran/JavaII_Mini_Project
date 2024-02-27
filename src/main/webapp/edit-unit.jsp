<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Unit</title>
</head>
<body>
	<form action = "editUnitServlet" method="post">
	<input type = "hidden" name = "id" value="${unitToEdit.id}">
	Name: <input type ="text" name = "unitName" value="${unitToEdit.unitName}">
	Level: <input type = "number" name = "level" min="0" value="${unitToEdit.level}">
	Hitpoints: <input type ="number" name = "hitpoints" min="0" value="${unitToEdit.hitPoints}">
	Strength: <input type = "number" name = "strength" min="0" value="${unitToEdit.strength}">
	Magic: <input type ="number" name = "magic" min="0" value="${unitToEdit.magic}">
	Skill: <input type = "number" name = "skill" min="0" value="${unitToEdit.skill}">
	SP: <input type ="number" name = "sp" min="0" value="${unitToEdit.sp}">
	Luck: <input type = "number" name = "luck" min="0" value="${unitToEdit.luck}">
	Defense: <input type ="number" name = "defense" min="0" value="${unitToEdit.defense}">
	Resistence: <input type = "number" name = "resistence" min="0" value="${unitToEdit.resistence}">
	<input type = "submit" value="Save Edited Unit">
	</form>
</body>
</html>