<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Unit</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="/JavaII_Mini_Project/css/form.css" />
</head>
<body>
	<form action = "editUnitServlet" method="post">
		<h1 class="text-light">Edit Unit</h1>
		<!-- NAME and LEVEL -->
		<input type = "hidden" name = "id" value="${unitToEdit.id}">
		<div id="name-lv" class="row">
			<div class="col form-group">
				<label class="form-label" for="unitName">Name</label>
				<input type="text" class="form-control" name="unitName" value="${unitToEdit.unitName}"/>
			</div>
			<div class="col form-group">
				<label class="form-label" for="level">Lv</label>
				<input type="number" class="form-control" name="level" min="0" value="0" value="${unitToEdit.level}"/>
			</div>
		</div>
		<div id="main-stats">
			<!-- Hit Points and SP -->
			<div class="row">
				<div class="col form-group">
					<label class="form-label" for="hitpoints">HP</label>
					<input type="number" class="form-control" name="hitpoints"  min="0" value="0" value="${unitToEdit.hitPoints}"/>
				</div>
				<div class="col form-group">
					<label class="form-label" for="sp">Sp</label>
					<input type="number" class="form-control" name="sp" min="0" value="0" value="${unitToEdit.sp}"/>
				</div>
			</div>
			<!-- Strength and Luck -->
			<div class="row">
				<div class="col form-group">
					<label class="form-label" for="strength">Str</label>
					<input type="number" class="form-control" name="strength"  min="0" value="0" value="${unitToEdit.strength}"/>
				</div>
				<div class="col form-group">
					<label class="form-label" for="luck">Lck</label>
					<input type="number" class="form-control" name="luck" min="0" value="0" value="${unitToEdit.luck}"/>
				</div>
			</div>
			<!-- Magic and Defense -->
			<div class="row">
				<div class="col form-group">
					<label class="form-label" for="magic">Mag</label>
					<input type="number" class="form-control" name="magic"  min="0" value="0" value="${unitToEdit.magic}"/>
				</div>
				<div class="col form-group">
					<label class="form-label" for="defense">Def</label>
					<input type="number" class="form-control" name="defense" min="0" value="0" value="${unitToEdit.defense}"/>
				</div>
			</div>
			<!-- Skill and Resistance -->
			<div class="row">
				<div class="col form-group">
					<label class="form-label" for="skill">Skill</label>
					<input type="number" class="form-control" name="skill"  min="0" value="0" value="${unitToEdit.skill}"/>
				</div>
				<div class="col form-group">
					<label class="form-label" for="resistence">Res</label>
					<input type="number" class="form-control" name="resistence" min="0" value="0" value="${unitToEdit.resistence}"/>
				</div>
			</div>
		</div>
		<!-- Weapons -->
		<div id="weapons">
			<h2 class="text-light">Weapons</h2>
			<select name="allWeaponsToAdd" multiple size="6">
				<c:forEach items="${unitToEdit.listOfWeapons}" var="currentWeapon">
					<option value="${currentWeapon.id}">
						${currentWeapon.weaponName}
					</option>
			</c:forEach>
			</select>
		</div>
		<button type="submit" class="btn btn-primary">Done</button>
		<a href="unit-menu.html" class="btn btn-secondary">Back</a>
	</form>
	
	<!-- BOOTSTRAP -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>