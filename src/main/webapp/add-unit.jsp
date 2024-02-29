<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Unit</title>

<!-- CSS LINKS -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="/JavaII_Mini_Project/css/form.css" />
</head>
<body>
	<form action="addUnitServlet" method="post">
	  <h1 class="text-light">Add Unit</h1>
		<!-- NAME and LEVEL -->
      <div class="d-flex">
	  <div id="panel1">
		<div id="name-lv" class="row">
			<div class="col form-group">
				<label class="form-label" for="unitName">Name</label>
				<input type="text" class="form-control" name="unitName" />
			</div>
			<div class="col form-group">
				<label class="form-label" for="level">Lv</label>
				<input type="number" class="form-control" name="level" min="0" value="0" />
			</div>
		</div>
		<div id="main-stats">
			<!-- Hit Points and SP -->
			<div class="row">
				<div class="col form-group">
					<label class="form-label" for="hitpoints">HP</label>
					<input type="number" class="form-control" name="hitpoints"  min="0" value="0"/>
				</div>
				<div class="col form-group">
					<label class="form-label" for="sp">Sp</label>
					<input type="number" class="form-control" name="sp" min="0" value="0" />
				</div>
			</div>
			<!-- Strength and Luck -->
			<div class="row">
				<div class="col form-group">
					<label class="form-label" for="strength">Str</label>
					<input type="number" class="form-control" name="strength"  min="0" value="0"/>
				</div>
				<div class="col form-group">
					<label class="form-label" for="luck">Lck</label>
					<input type="number" class="form-control" name="luck" min="0" value="0" />
				</div>
			</div>
			<!-- Magic and Defense -->
			<div class="row">
				<div class="col form-group">
					<label class="form-label" for="magic">Mag</label>
					<input type="number" class="form-control" name="magic"  min="0" value="0"/>
				</div>
				<div class="col form-group">
					<label class="form-label" for="defense">Def</label>
					<input type="number" class="form-control" name="defense" min="0" value="0" />
				</div>
			</div>
			<!-- Skill and Resistance -->
			<div class="row">
				<div class="col form-group">
					<label class="form-label" for="skill">Skill</label>
					<input type="number" class="form-control" name="skill"  min="0" value="0"/>
				</div>
				<div class="col form-group">
					<label class="form-label" for="resistence">Res</label>
					<input type="number" class="form-control" name="resistence" min="0" value="0" />
				</div>
			</div>
		</div>
		</div>
		<!-- Weapons -->
		<div id="weapons">
			<h2 class="text-light">Weapons</h2>
			<select name="allWeaponsToAdd" multiple size="6">
				<c:forEach items="${requestScope.allWeapons}" var="currentWeapon">
					<option value="${currentWeapon.id}">
						${currentWeapon.weaponName}
					</option>
			</c:forEach>
			</select>
		</div>
		</div>
		<button type="submit" class="btn btn-primary">Add Unit</button>
		<a href="unit-menu.html" class="btn btn-secondary">Back</a>
	</form>
	
	<!-- BOOTSTRAP -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>