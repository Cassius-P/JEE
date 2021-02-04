package fr.epsi.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import fr.epsi.entity.Facture;

public class FactureDTO {

	private Long id;
	private String date;
	private String numero;
	private double prix;
	private ClientDTO client;
	
	public FactureDTO( ) {}
	
	public FactureDTO (Facture f) 
	{
		id = f.getId();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");		
		date = formatter.format(f.getDate());
		numero = f.getNumero();
		prix = f.getPrix();		
		client = new ClientDTO(f.getClient());
	}
	
	public ClientDTO getClient() {
		return client;
	}
	public void setClient(ClientDTO client) {
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");		
		this.date = formatter.format(date);
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
}
