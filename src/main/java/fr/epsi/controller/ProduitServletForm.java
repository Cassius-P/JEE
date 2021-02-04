package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.dto.ProduitDTO;
import fr.epsi.service.ProduitService;

// Annotation déclarant la route pour laquelle la Servlet va traiter les différentes methodes HTTP (GET, POST, PUT, etc...)

@WebServlet("/produitform")
public class ProduitServletForm extends HttpServlet {

// Injection de dépendance d'un objet ClientService	de la couche service
	
	@EJB 
	ProduitService service;
	
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/FormulaireProduit.jsp").forward(req, resp);
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
		resp.sendRedirect("/TP_PRODUIT_EJB-0.0.1-SNAPSHOT/produitliste");
    }

}
