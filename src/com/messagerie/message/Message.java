package com.messagerie.message;

import java.util.ArrayList;
import java.util.List;

import com.messagerie.Utilisateur;
import com.messagerie.formatting.IMessageFormatter;

public class Message implements IMessage {
	
	private static final String PATTERN_COULEUR = "#";
	private static final String PATTERN_LIEN = "http://";
	
	private List<Element> elements;
	
	private Utilisateur auteur;

	@Override
	public List<Element> getElements() {
		return elements;
	}
	
	@Override
	public void setElements(List<Element> elements) {
		this.elements = elements;
	}

	public Utilisateur getAuteur() {
		return auteur;
	}

	public void setAuteur(Utilisateur auteur) {
		this.auteur = auteur;
	}

	public Message(String contenu, Utilisateur auteur) {
		elements = new ArrayList<>();
		elements.add(new Texte(contenu));
		this.auteur = auteur;
	}

	@Override
	public void formatter(IMessageFormatter f) {
		f.appliquer(this);
		
	}
	
	@Override
	public String toString() {
		return auteur.getNom() + " : " + Element.join(elements);
	}

	public final static boolean isCouleur(String recherche) {
		return recherche.startsWith(PATTERN_COULEUR);
	}
	public final static boolean isLien(String recherche) {
		return recherche.startsWith(PATTERN_LIEN);
	}
	
}
