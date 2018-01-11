package com.master.recherche;

import java.util.List;

import com.messagerie.message.IMessage;
import com.messagerie.message.TexteColorise;

public class CouleurChercheur extends Chercheur {

	@Override
	protected IMessage trouve(List<IMessage> messages, String recherche) {
		
		if (isCouleur(recherche)) {
			for (IMessage message : messages) {
				if (message.getElements().stream().filter(e -> e instanceof TexteColorise && ((TexteColorise) e).getCouleurHex().contains(recherche)).findAny().isPresent()) {
					return message;
				}
			}
		}
		
		return null;
	}
	
}
