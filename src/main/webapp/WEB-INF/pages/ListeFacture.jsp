<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Liste Factures</title>
	<%@ include file="commons/header.jsp" %>
</head>
<body>

	<%@ include file="commons/menu.jsp" %>

	<br>
	<h4> Liste des Factures </h4>
	<br>	
        
        <table class="striped">
     	    <thead>
	          	<tr>
	              	<th>Numero</th>
	              	<th>Date</th>
	              	<th>Client</th>
	         		<th>Montant</th>	              
	        	</tr>
	        </thead>
        <c:forEach var="Facture" items="${listeFacture}">
	        <tbody>
	          	<tr>
	          		<td>
	          			<a href="facturedetail?numero=${Facture.numero}">${Facture.numero}</a>
	          		</td>
	          		<%-- <td>${Facture.numero}</td> --%>
	          		<td>${Facture.date}</td>
		            <td>${Facture.client.nom}</td>
		            <td>${Facture.prix} Euros</td>
	          	</tr>
	        </tbody>
	        </c:forEach>
      </table>
	
	<%@ include file="commons/footer.jsp" %>
</body>
</html>