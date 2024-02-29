<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Weapon</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/JavaII_Mini_Project/css/weap.css" />
</head>
<body>
	<form action = "addWeaponServlet" method="post">
		<h2 class="text-light">Add Weapon</h2>
		<div class="form-group">
			<label class="form-label" for="weaponName">Name</label>
			<input type ="text" class="form-control" name = "weaponName">
		</div>
		<div class="form-group">
			<label class="form-label" for="mastery">Mastery</label>
			<input type ="text" class="form-control" name = "mastery" maxlength="1" value="C">
		</div>
		<div class="form-group">
			<label class="form-label" for="endurance">Endurance</label>
			<input type ="number" class="form-control" name = "endurance" min="0" value="0">
		</div>
		<button class="btn btn-primary" type="submit">Add Weapon</button>
		<a href="weapon-menu.html" class="btn btn-secondary">Return to Weapon Menu</a>
	</form>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>