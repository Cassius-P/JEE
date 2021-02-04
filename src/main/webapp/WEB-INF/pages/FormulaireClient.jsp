<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Formulaire Création Client</title>
	<%@ include file="commons/header.jsp" %>
	<style>
	
		input[type="submit"] {
		width: 30%;
		position: relative;
		left: 50%;
		transform: translateX(-50%)
	}
	
	form, h4 {
		text-align: center;
		display: inline-grid;
		position: relative;
		left: 50%;
		transform: translateX(-50%);
		width: 30%		
	}
	
	</style>
</head>
<body>

	<%@ include file="commons/menu.jsp" %>
<br>
<h4>Création d'un nouveau client</h4>
<br><br>
	<form action="clientform" method="post">
		<label for="nom">Nom</label><input type="text" name="nomClient"/>
		<label for="adresseClient">Adresse</label><input type="text" name="adresseClient"/>				
		<br>
		<input type="submit" value="Valider"/>
	</form>
        
	<%@ include file="commons/footer.jsp" %>
</body>
</html>