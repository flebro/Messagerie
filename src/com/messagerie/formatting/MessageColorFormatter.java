package com.messagerie.formatting;

import com.messagerie.message.Couleur;

public class MessageColorFormatter extends MessageFormatter<Couleur> {

	public MessageColorFormatter() {
		super("[color=", "[/color]");
	}
	
	@Override
	protected Couleur buildElement(String data) {
		return new Couleur(data.substring(7, data.length() - 1));
	}
	
}
