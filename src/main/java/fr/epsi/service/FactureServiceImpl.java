package fr.epsi.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import fr.epsi.dao.FactureDao;
import fr.epsi.dao.FactureDaoImpl;
import fr.epsi.dto.FactureDTO;
import fr.epsi.entity.Client;
import fr.epsi.entity.Facture;
import fr.epsi.entity.LigneFacture;
import fr.epsi.entity.Produit;

@Stateless
public class FactureServiceImpl implements FactureService {

// Injection de d�pendance d'un objet la classe repository s'occupant de la persistence pour les objets Facture		
	
	@EJB
	FactureDao dao = new FactureDaoImpl();
	@EJB
	ClientService clientService;
	@EJB
	ProduitService produitService;
	
	public List<Facture> getListeFacture()
	{		
		return dao.getListeFacture();
	}
	
	/* 	Cr�ation d'une liste d'objets FactureDTO � partir d'une liste d'objets Client, 
	 * 	afin d'�viter d'envoyer des objets Factures au Controller, et donc � la Vue
	 */
	
	public List<FactureDTO> getListeFactureDTO()
	{
		List<FactureDTO> fListDTO = new ArrayList<FactureDTO>();
		for (Facture f : dao.getListeFacture()) 
		{
			FactureDTO fDTO = new FactureDTO(f);
			fListDTO.add(fDTO);
		}
		return fListDTO;
	}
	
	public FactureDTO getFactureByNum(String num) {
		
		Facture f = dao.getFactureByNum(num);
		FactureDTO fDTO = new FactureDTO(f);

		if (fDTO.getNumero().equals(num))
		{
			return fDTO;
		}
		return null;
	}

	public void createFactureTest(){
		Facture f = new Facture();



		Date date = new Date();

		Random r = new Random();
		int low = 10;
		int high = 10000;
		int result = r.nextInt(high-low) + low;
		f.setNumero(String.valueOf(result));


		Client c = clientService.getListeClient().get(result % 2 == 0 ? 0 : 1);
		f.setDate(date);
		f.setClient(c);


		List<Produit> produits = produitService.getListeProduit();
		List<LigneFacture> ligneFactures = new ArrayList<LigneFacture>();
		for (Produit produit : produits ) {

			LigneFacture lf = new LigneFacture(produit, result % 2 == 0 ? 1 : 2);
			lf.setFacture(f);
			ligneFactures.add(lf);
		}
		f.setLigneFactures(ligneFactures);


		System.out.println("Facture "+f.getNumero());
		System.out.println(f.getClient().getNom());
		for (Produit produit : f.getProduits()) {
			System.out.println(produit.getNom() +" - "+ String.valueOf(produit.getPrix()));
		}
		System.out.println(f.getPrix()+"€");

		dao.create(f);

	}
}
