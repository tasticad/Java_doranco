package fr.doranco.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.doranco.entity.Adresse;
import fr.doranco.entity.Article;
import fr.doranco.entity.Utilisateur;

@SpringBootApplication
public class ProjetFinalMain {

	public static void main(String[] args) {

		Adresse adresse = new Adresse();
		Article article = new Article();
		Utilisateur utilisateur = new Utilisateur();
		
		adresse.setRue("de la Feignasse");
		String rue = adresse.getRue();
		System.out.println(rue);
		System.out.println(adresse);
		System.out.println(article);
		System.out.println(utilisateur);
		
		SpringApplication.run(ProjetFinalMain.class, args);
		
	}

}
