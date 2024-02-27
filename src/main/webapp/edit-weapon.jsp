<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Weapon</title>
</head>
<body>
	<form action = "editWeaponServlet" method="post">
	<input type = "hidden" name = "id" value="${weaponToEdit.id}">
	Name: <input type ="text" name = "weaponName" value="${weaponToEdit.weaponName}">
	Mastery: <input type = "text" name = "mastery" maxlength="1" value="${weaponToEdit.mastery}">
	Endurance: <input type ="number" name = "endurance" min="0" value="${weaponToEdit.endurance}">
	
	<input type = "submit" value="Save Edited Weapon">
	</form>
</body>
</html>