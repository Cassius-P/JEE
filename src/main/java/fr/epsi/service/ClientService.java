package fr.epsi.service;

import java.util.List;

import fr.epsi.dto.ClientDTO;
import fr.epsi.entity.Client;

public interface ClientService 
{
	void create(ClientDTO p);
	public List<Client> getListeClient();
	public List<ClientDTO> getListeClientDTO();
}
