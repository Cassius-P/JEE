<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Liste Clients</title>
	<%@ include file="commons/header.jsp" %>
</head>
<body>

	<%@ include file="commons/menu.jsp" %>

	<br>
	<h4> Liste des Clients </h4>
	<br>
	<a href="/TP_PRODUIT_EJB-0.0.1-SNAPSHOT/clientform"><button>Ajouter</button></a>
	<br><br>
        
        <table class="striped">
     	    <thead>
	          	<tr>
	              	<th>N°</th>
	              	<th>Nom</th>
	         		<th>Adresse</th>	              
	        	</tr>
	        </thead>
        <c:forEach var="client" items="${listeClient}">
	        <tbody>
	          	<tr>
	          		<td>${client.id}</td>
		            <td>${client.nom}</td>
		            <td>${client.adresse}</td>
	          	</tr>
	        </tbody>
	        </c:forEach>
      </table>
	
	<%@ include file="commons/footer.jsp" %>
</body>
</html>