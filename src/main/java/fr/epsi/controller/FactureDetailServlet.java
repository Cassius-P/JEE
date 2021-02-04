package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.dto.FactureDTO;
import fr.epsi.service.FactureService;

// Annotation déclarant la route pour laquelle la Servlet va traiter les différentes methodes HTTP (GET, POST, PUT, etc...)

@WebServlet("/facturedetail")
public class FactureDetailServlet extends HttpServlet {

// Injection de dépendance d'un objet ProduitService de la couche service	
	
	@EJB
	private FactureService service;
	
	public void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String num=req.getParameter("numero");
		FactureDTO facture = service.getFactureByNum(num);
		String fac = facture != null ? facture.getNumero() : "Facture non trouvé";
		req.setAttribute("facture", facture);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/DetailFacture.jsp").forward(req, resp);
	}
}
