<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu BusinessCorp</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<style>
	ul {
		position: absolute;
		right: 3%
	}
</style>
</head>
<body>
  <nav>  	
    <div class="nav-wrapper">
      <a style="position: absolute; left:3%" href="/TP_PRODUIT_EJB-0.0.1-SNAPSHOT/home" class="brand-logo">Business Corp</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
      	<li><a href="/TP_PRODUIT_EJB-0.0.1-SNAPSHOT/clientliste">Client</a></li>
        <li><a href="/TP_PRODUIT_EJB-0.0.1-SNAPSHOT/produitliste">Produit</a></li>
        <li><a href="/TP_PRODUIT_EJB-0.0.1-SNAPSHOT/factureliste">Facture</a></li>
        <li></li> 
        <!-- <li><a href="/TP_PRODUIT_EJB-0.0.1-SNAPSHOT/clientform">Creation Client</a></li>
        <li><a href="/TP_PRODUIT_EJB-0.0.1-SNAPSHOT/produitform">Creation Produit</a></li>   -->    
      </ul>
    </div>
  </nav>

</body>
</html>