<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Liste Produits</title>
    <%@ include file="commons/header.jsp" %>
</head>
<body>

    <%@ include file="commons/menu.jsp" %>
<br>
<h4> Liste des Produits </h4>
<br>
<a href="/TP_PRODUIT_EJB-0.0.1-SNAPSHOT/produitform"><button>Ajouter</button></a>
<br><br>
        <table class="striped">
            <thead>
                  <tr>
                      <th>N°</th>
                      <th>Nom</th>
                     <th>Prix</th>                
                     <th>Code Barre</th>      
                </tr>
            </thead>
        <c:forEach var="produit" items="${listeProduit}">

            <tbody>
                  <tr>
                    	<td>${produit.id}</td>
	                    <td>${produit.nom}</td>
	                    <td>${produit.prix} Euro</td>
	                    <td>${produit.codeBarre}</td>
                  </tr>
            </tbody>
            </c:forEach>
      </table>
    
    <%@ include file="commons/footer.jsp" %>
</body>
</html>