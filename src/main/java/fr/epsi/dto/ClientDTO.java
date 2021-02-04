package fr.epsi.dto;

import fr.epsi.entity.Client;

public class ClientDTO {

	private Long id;
	private String nom;
	private String adresse;
	
	public ClientDTO() {}
	
	public ClientDTO(Client c)
	{
		id = c.getId();
		nom = c.getNom();
		adresse = c.getAdresse();
	}
	
	public ClientDTO (String n, String a) 
	{
		this.nom = n;
		this.adresse = a;
	}
	
	public Long getId() 
	{
		return id;
	}
	
	public void setId(Long id) 
	{
		this.id = id;
	}
	
	public String getNom() 
	{
		return nom;
	}
	
	public void setNom(String n) 
	{
		this.nom = n;
	}
	
	public String getAdresse() 
	{
		return adresse;
	}
	
	public void setAdresse(String a) 
	{
		this.adresse = a;
	}
	
}
