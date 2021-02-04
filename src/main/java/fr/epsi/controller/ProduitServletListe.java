package fr.epsi.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.dto.ProduitDTO;
import fr.epsi.entity.Produit;
import fr.epsi.service.ProduitService;

// Annotation déclarant la route pour laquelle la Servlet va traiter les différentes methodes HTTP (GET, POST, PUT, etc...)

@WebServlet("/produitliste")
public class ProduitServletListe extends HttpServlet {

// Injection de dépendance d'un objet ProduitService de la couche service
	
	@EJB 
	ProduitService service;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
			List<Produit> listProd = new ArrayList<Produit>();
			listProd = service.getListeProduit();
			req.setAttribute("listeProduit", listProd);
			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ListeProduit.jsp").forward(req, resp);
	    }
	
	 // Methode doPost récupérant les champs du formulaire de la page .jsp, afin de construire un objet DTO	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
			String nom = req.getParameter("nomProduit");
			String codeBarre = req.getParameter("codeBarre");
			String prix = req.getParameter("prix");
			ProduitDTO p = new ProduitDTO(nom, codeBarre, prix);
			service.create(p);
	    }
}
