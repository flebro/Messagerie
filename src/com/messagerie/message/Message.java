package com.messagerie.message;

import java.util.ArrayList;
import java.util.List;

import com.messagerie.Utilisateur;
import com.messagerie.formatting.IMessageFormatter;

public class Message implements IMessage {
	
	private List<Element> elements;
	
	private Utilisateur auteur;

	@Override
	public List<Element> getElements() {
		return elements;
	}
	
	
	
	public Utilisateur getAuteur() {
		return auteur;
	}

	public void setAuteur(Utilisateur auteur) {
		this.auteur = auteur;
	}

	public Message(String contenu) {
		elements = new ArrayList<>();
		elements.add(new Texte(contenu));
		auteur=new Utilisateur(null);
	}

	@Override
	public void formatter(IMessageFormatter f) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return auteur.toString() + " : " + Element.join(elements);
	}

}
