package fr.epsi.entity;

import javax.persistence.*;

@Entity
@Table(name = "lignefacture")
public class LigneFacture {

    public LigneFacture(Produit produit, int qte){
        this.setProduitWithQuantity(produit, qte);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ligneFactures_id;

    @ManyToOne
    private Facture facture;

    @ManyToOne
    private Produit produit;

    @Column(name="prix")
    private double prix;

    @Column(name="qte")
    private int qte;

    public LigneFacture() {}

    public Long getId() {
        return ligneFactures_id;
    }
    public Facture getFacture() {
        return facture;
    }

    public Produit getProduit() {
        return produit;
    }

    public int getQte() {
        return qte;
    }

    public double getPrix() {
        return prix;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public void setProduitWithQuantity(Produit produit, int qte) {
        this.produit = produit;
        this.qte = qte;
        this.prix = produit.getPrix()*qte;
    }



}
