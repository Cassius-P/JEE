package fr.epsi.dao;

import java.util.List;

import fr.epsi.entity.Produit;

public interface ProduitDao 
{
	void create(Produit v);
	public List<Produit> getListeProduit();
}
