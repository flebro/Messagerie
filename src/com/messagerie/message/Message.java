package com.messagerie.message;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.messagerie.Utilisateur;
import com.messagerie.formatting.IMessageFormatter;

public class Message implements IMessage {
	
	private List<Texte> elements;
	
	private Utilisateur auteur;

	@Override
	public List<Texte> getElements() {
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
	}

	@Override
	public void formatter(IMessageFormatter f) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return auteur.toString() + " : " + String.join(" ", elements.stream().map(Texte::toString).collect(Collectors.toList()));
	}

}
