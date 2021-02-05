package fr.epsi.dao;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.entity.Client;
import fr.epsi.entity.Facture;

/* 	Classe Repr�sentant la couche repository pour l'entit� Facture
 *	Ainsi q'une annotation pr�cisant au framework que cette classe fait autorit� de transaction
 */	
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class FactureDaoImpl implements FactureDao {
	
// D�claration du contexte de persistence comme pr�cis� dans le persistence.xml
	
	@PersistenceContext(unitName = "produitPU")
	EntityManager em;
	
	@Resource
	UserTransaction utx;

	public FactureDaoImpl() {}
	
// M�thode recuperant la liste des Factures déjà pr�sentes dans la database
	
	public List<Facture> getListeFacture()
	{		
		List<Facture> listFac = new ArrayList<Facture>();
		listFac = em.createQuery("SELECT f FROM Facture f ORDER BY f.id").getResultList();
		return listFac;		
	}

// Methodes recherchant une ou des Facture dans la database, avec un numero de facture pass� en param�tre
	
	public Facture getFactureByNum(String num)
	{		
		Facture f1 = new Facture();		
		System.out.println("Numero Facture parametre :"+num);
		f1 = (Facture) em.createQuery("SELECT f FROM Facture f WHERE f.numero = '"+num+"'", Facture.class)
				.getSingleResult();		
		return f1;
	}

	public List<Facture> getFactureByNumList(String num)
	{		
		List<Facture> f = new ArrayList<Facture>();		
		f = em.createQuery("SELECT f FROM Facture f WHERE f.numero = '"+num+"'", Facture.class)
				.getResultList();		
		return f;
	}

	public void create(Facture f) {
		try {
			utx.begin();
			em.merge(f);
			utx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
