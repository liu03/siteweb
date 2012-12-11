package com.ifi.bo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personne {
	@Id
	private String nom;

	public Personne() {
	}
	
	public Personne(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
