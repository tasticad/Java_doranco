package fr.doranco.entity;

import java.io.Serializable;

public class LigneDeCommande implements Serializable {
	
	
	private static final long serialVersionUID = -5468608944888314228L;
	
	private Integer id;
	private Integer quantite; 
	private Double prixUnitaire ;
	private Double remiseArticle; 
	private Commande commande;
	private Article article;
	
	
	public LigneDeCommande() {
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getQuantite() {
		return quantite;
	}


	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}


	public Double getPrixUnitaire() {
		return prixUnitaire;
	}


	public void setPrixUnitaire(Double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}


	public Double getRemiseArticle() {
		return remiseArticle;
	}


	public void setRemiseArticle(Double remiseArticle) {
		this.remiseArticle = remiseArticle;
	}


	public Commande getCommande() {
		return commande;
	}


	public void setCommande(Commande commande) {
		this.commande = commande;
	}


	public Article getArticle() {
		return article;
	}


	public void setArticle(Article article) {
		this.article = article;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "LigneDeCommande [id=" + id + ", quantite=" + quantite + ", prixUnitaire=" + prixUnitaire
				+ ", remiseArticle=" + remiseArticle + ", commande=" + commande + ", article=" + article + "]";
	}
	
	
		
}
