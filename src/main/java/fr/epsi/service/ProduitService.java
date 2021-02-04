package fr.epsi.service;

import java.util.List;

import fr.epsi.dto.ProduitDTO;
import fr.epsi.entity.Produit;

public interface ProduitService {

	public void create(ProduitDTO p);
	public List<Produit> getListeProduit();
	public Produit findProductByName(String n);
}
