package fr.epsi.dao;

import java.util.List;

import fr.epsi.entity.Facture;

public interface FactureDao 
{
	public List<Facture> getListeFacture();
	public Facture getFactureByNum(String n);
	public List<Facture> getFactureByNumList(String n);
	public void create(Facture f);
}
