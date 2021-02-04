<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ page import="java.util.ArrayList" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detail Facture</title>
<%@ include file="commons/header.jsp" %>
</head>
<body>
<%@ include file="commons/menu.jsp" %>

	<br>
	<h4> Detail Facture ${facture.numero} </h4>
	<br>

        <table class="striped">
     	    <thead>
	          	<tr>
	              	<th>N°</th>
	              	<th>Date</th>
	              	<th>Client</th>
	         		<th>Montant</th>	              
	        	</tr>
	        </thead>
        
	        <tbody>
	          	<tr>
	          		<td>${facture.numero}</td>
	          		<td>${facture.date}</td>
		            <td>${facture.client.nom}</td>
		            <td>${facture.prix} Euros</td>
	          	</tr>
	        </tbody>
		</table>
<%@ include file="commons/footer.jsp" %>
</body>
</html>