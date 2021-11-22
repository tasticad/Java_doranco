package fr.doranco.entity;

import java.util.List;

public class Categorie {

	private Integer id;
	private String nom;
	private Double remise;
	private Boolean isRemiseCumulable;
	private String photo;
	private List<Article> articles;
	
	public Categorie() {
		
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
	public Double getRemise() {
		return remise;
	}
	public void setRemise(Double remise) {
		this.remise = remise;
	}

	
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	public Boolean getIsRemiseCumulable() {
		return isRemiseCumulable;
	}
	public void setIsRemiseCumulable(Boolean isRemiseCumulable) {
		this.isRemiseCumulable = isRemiseCumulable;
	}
	@Override
	public String toString() {
		return "Categorie [id=" + id + ", nom=" + nom + ", remise=" + remise + ", isRemiseCumulable="
				+ isRemiseCumulable + ", photo=" + photo + ", articles=" + articles + "]";
	}
	
	
	
}