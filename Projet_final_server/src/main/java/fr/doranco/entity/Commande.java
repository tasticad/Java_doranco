package fr.doranco.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Commande implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer numero;
	private Date dateCreation;
	private Date dateLivraison;
	private Double totalRemise;
	private Double fraisExpedition;
	private Double totalGeneral;
	private Adresse adresseFacturation;
	private Adresse adresselivraison;
	private CartePaiement cartePaiementDefaut;
	private Utilisateur utilisateur;
	private List<LigneDeCommande> lignesCommande;
	
	public Commande() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateLivraison() {
		return dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	public Double getTotalRemise() {
		return totalRemise;
	}

	public void setTotalRemise(Double totalRemise) {
		this.totalRemise = totalRemise;
	}

	public Double getFraisExpedition() {
		return fraisExpedition;
	}

	public void setFraisExpedition(Double fraisExpedition) {
		this.fraisExpedition = fraisExpedition;
	}

	public Double getTotalGeneral() {
		return totalGeneral;
	}

	public void setTotalGeneral(Double totalGeneral) {
		this.totalGeneral = totalGeneral;
	}

	public Adresse getAdresseFacturation() {
		return adresseFacturation;
	}

	public void setAdresseFacturation(Adresse adresseFacturation) {
		this.adresseFacturation = adresseFacturation;
	}

	public Adresse getAdresselivraison() {
		return adresselivraison;
	}

	public void setAdresselivraison(Adresse adresselivraison) {
		this.adresselivraison = adresselivraison;
	}

	public CartePaiement getCartePaiementDefaut() {
		return cartePaiementDefaut;
	}

	public void setCartePaiementDefaut(CartePaiement cartePaiementDefaut) {
		this.cartePaiementDefaut = cartePaiementDefaut;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<LigneDeCommande> getLignesCommande() {
		return lignesCommande;
	}

	public void setLignesCommande(List<LigneDeCommande> lignesCommande) {
		this.lignesCommande = lignesCommande;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", numero=" + numero + ", dateCreation=" + dateCreation + ", dateLivraison="
				+ dateLivraison + ", totalRemise=" + totalRemise + ", fraisExpedition=" + fraisExpedition
				+ ", totalGeneral=" + totalGeneral + ", adresseFacturation=" + adresseFacturation
				+ ", adresselivraison=" + adresselivraison + ", cartePaiementDefaut=" + cartePaiementDefaut
				+ ", utilisateur=" + utilisateur + ", lignesCommande=" + lignesCommande + "]";
	}
	


	
	

}