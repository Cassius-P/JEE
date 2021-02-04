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
import fr.epsi.entity.Produit;

/* 	Classe Représentant la couche repository pour l'entité Produit
 *	Ainsi q'une annotation précisant au framework que cette classe fait autorité de transaction
 */
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ProduitDaoImpl implements ProduitDao {
	
// Déclaration du contexte de persistence comme précisé dans le persistence.xml	
	
	@PersistenceContext(unitName = "produitPU")
	EntityManager em;
	
	@Resource
	UserTransaction utx;

	public ProduitDaoImpl() { }
	
// Méthode permettant de faire persister un objet "Produit" dans la database, dans la table du même nom	
	
	public void create(Produit v) {
		try {
			utx.begin();
			em.persist(v);
			utx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
// Méthode récupérant la liste des Produits déjà présents dans la database	
	
	public List<Produit> getListeProduit()
	{
		List<Produit> listProd = new ArrayList<Produit>();		
		listProd = em.createQuery("SELECT p FROM Produit p ORDER BY p.nom").getResultList();
		return listProd;
	}
}
