<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Weapon</title>
</head>
<body>
	<form action = "addWeaponServlet" method="post">
	Name: <input type ="text" name = "weaponName">
	Mastery: <input type = "text" name = "mastery" maxlength="1" value="C">
	Endurance: <input type ="number" name = "endurance" min="0" value="0">
	<input type = "submit" value="Add Weapon">
	</form> <br />
	
	<a href="weapon-menu.html">Back</a>
</body>
</html>