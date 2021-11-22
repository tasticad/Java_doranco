package fr.doranco.entity;

import java.io.Serializable;
import java.util.Date;

public class CartePaiement implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nomProprietaire;
	private String prenomProprietaire;
	private byte[] numero;
	private Date dateFinValidite;
	private byte[] cryptogramme;
	private Utilisateur utilisateur;

	public CartePaiement() {

	}


	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNomProprietaire() {
		return nomProprietaire;
	}



	public void setNomProprietaire(String nomProprietaire) {
		this.nomProprietaire = nomProprietaire;
	}



	public String getPrenomProprietaire() {
		return prenomProprietaire;
	}



	public void setPrenomProprietaire(String prenomProprietaire) {
		this.prenomProprietaire = prenomProprietaire;
	}



	public byte[] getNumero() {
		return numero;
	}



	public void setNumero(byte[] numero) {
		this.numero = numero;
	}



	public Date getDateFinValidite() {
		return dateFinValidite;
	}



	public void setDateFinValidite(Date dateFinValidite) {
		this.dateFinValidite = dateFinValidite;
	}



	public byte[] getCryptogramme() {
		return cryptogramme;
	}



	public void setCryptogramme(byte[] cryptogramme) {
		this.cryptogramme = cryptogramme;
	}



	public Utilisateur getUtilisateur() {
		return utilisateur;
	}



	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "CartePaiement [id=" + id + ", nomProprietaire=" + nomProprietaire + ", prenomProprietaire="
				+ prenomProprietaire + ", numero=" + numero + ", dateFinValidite=" + dateFinValidite + ", cryptogramme="
				+ cryptogramme + ", utilisateur=" + utilisateur + "]";
	}

}