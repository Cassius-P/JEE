package fr.epsi.dao;

import java.util.List;

import fr.epsi.entity.Client;

public interface ClientDao 
{
	void create(Client v);
	public List<Client> getListeClient();
}
