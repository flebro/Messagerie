package com.messagerie.message;

import java.util.ArrayList;
import java.util.List;

import com.messagerie.Utilisateur;

public class Message implements IMessage {
	
	private List<Texte> elements;

	@Override
	public List<Texte> getElements() {
		return elements;
	}
	
	public Message(String contenu) {
		elements = new ArrayList<>();
		elements.add(new Texte(contenu));
	}

}
