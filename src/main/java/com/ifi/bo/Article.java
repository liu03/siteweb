package com.ifi.bo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Article implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String titre;
	private Personne auteur;
	private String contenu;

	public Article() {
	}
	
	public Article(String titre, Personne auteur, String contenu) {
		this.titre = titre;
		this.auteur = auteur;
		this.contenu = contenu;
	}
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return this.titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setAuteur(Personne auteur) {
		this.auteur = auteur;
	}
	
	public Personne getAuteur() {
		return this.auteur;
	}
	
	public String getContenu() {
		return this.contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}


}
