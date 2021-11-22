package fr.doranco.entity;

import java.io.Serializable;

public class ArticleCommentaire implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4650717656770615201L;
	
	private Integer id;
	private String texte;
	private Integer note; // (sur 5)
	private Article article;
	private Utilisateur utilisateur;
	
	public ArticleCommentaire() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public Integer getNote() {
		return note;
	}

	public void setNote(Integer note) {
		this.note = note;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "ArticleCommentaire [id=" + id + ", texte=" + texte + ", note=" + note + ", article=" + article
				+ ", utilisateur=" + utilisateur + "]";
	}
	
}