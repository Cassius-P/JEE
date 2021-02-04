package fr.epsi.dto;

import fr.epsi.entity.Produit;

public class ProduitDTO {

	private Long id;
	private String nom;
	private String codeBarre;
	private String prix;
	
	public ProduitDTO () {}
	
	public ProduitDTO (String n, String c, String p) 
	{
		this.nom = n;
		this.codeBarre = c;
		this.prix = p;
	}
	
	public ProduitDTO (Produit p)
	{
		id = p.getId();
		nom = p.getNom();
		codeBarre = p.getCodeBarre();
		prix = String.valueOf(p.getPrix());
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) 
	{
		this.nom = nom;
	}
	
	public String getCodeBarre() 
	{
		return codeBarre;
	}
	
	public void setCodeBarre(String codeBarre) 
	{
		this.codeBarre = codeBarre;
	}
	
	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}
	
}
