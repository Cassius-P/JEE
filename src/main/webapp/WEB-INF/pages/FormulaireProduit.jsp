<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Formulaire Création Produit</title>
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
	<h4>Création d'un nouveau produit</h4>
	<br><br>
	<form action="produitform" method="post">
		<label for="nomProduit">Nom</label><input type="text" name="nomProduit"/>
		<label for="codeBarre">Code Barre</label><input type="text" name="codeBarre"/>
		<label for="prix">Prix</label><input type="text" name="prix"/>
		<br>
		<input type="submit" value="Valider"/>
	</form>
        
	<%@ include file="commons/footer.jsp" %>
</body>
</html>