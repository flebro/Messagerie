package com.messagerie.message;

import java.util.List;

public class Texte extends Element {

	private String contenu;
	private Texte precedent;
	private Texte suivant;
	
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Texte getPrecedent() {
		return precedent;
	}
	public void setPrecedent(Texte precedent) {
		this.precedent = precedent;
	}
	public Texte getSuivant() {
		return suivant;
	}
	public void setSuivant(Texte suivant) {
		this.suivant = suivant;
	}
	
	public Texte() {}
	
	public Texte(String contenu) {
		this.contenu = String.join(" ", contenu);
	}
	
	public Texte(List<String> parts) {
		this.contenu = String.join(" ", parts);
	}
	
	@Override
	public String toString() {
		return contenu;
	}
	
}
