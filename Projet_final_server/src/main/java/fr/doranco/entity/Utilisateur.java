package fr.doranco.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Utilisateur implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private Boolean isActif;
	private String profil;
	private String email;
	private byte[] password;
	private String telephone;
	private List<Adresse> adresses;
	private List<Commande> commandes;
	private List<CartePaiement> cartesdePaiement;
	private List<Commentaire> commentaires;
	private List<ArticlePanier> panier;

	public Utilisateur() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Boolean getIsActif() {
		return isActif;
	}

	public void setIsActif(Boolean isActif) {
		this.isActif = isActif;
	}

	public String getProfil() {
		return profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte[] getPassword() {
		return password;
	}

	public void setPassword(byte[] password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<Adresse> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public List<CartePaiement> getCartesdePaiement() {
		return cartesdePaiement;
	}

	public void setCartesdePaiement(List<CartePaiement> cartesdePaiement) {
		this.cartesdePaiement = cartesdePaiement;
	}

	public List<Commentaire> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	public List<ArticlePanier> getPanier() {
		return panier;
	}

	public void setPanier(List<ArticlePanier> panier) {
		this.panier = panier;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", isActif=" + isActif + ", profil=" + profil + ", email=" + email + ", password="
				+ Arrays.toString(password) + ", telephone=" + telephone + "]";
	}

}