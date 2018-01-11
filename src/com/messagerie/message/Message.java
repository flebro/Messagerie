package com.messagerie.message;

import java.util.ArrayList;
import java.util.List;

import com.messagerie.Utilisateur;

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

	public Message(Utilisateur auteur) {
		this.auteur = auteur;
		elements = new ArrayList<>();
	}

	@Override
	public void formatter(IMessageFormatter f) {
		// TODO Auto-generated method stub
		
	}

}
