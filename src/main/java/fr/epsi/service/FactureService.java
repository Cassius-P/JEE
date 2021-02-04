package fr.epsi.service;

import java.util.List;

import fr.epsi.dto.FactureDTO;
import fr.epsi.entity.Facture;

public interface FactureService 
{
	public List<Facture> getListeFacture();
	public List<FactureDTO> getListeFactureDTO();
	public FactureDTO getFactureByNum(String n);
}
