package com.master.recherche;

import java.util.List;

import com.messagerie.message.IMessage;
import com.messagerie.message.Lien;

public class LinkChercheur extends Chercheur {

	@Override
	protected IMessage trouve(List<IMessage> messages, String recherche) {
		
		if (isLien(recherche)) {
			for (IMessage message : messages) {
				if (message.getElements().stream().filter(e -> e instanceof Lien && ((Lien) e).getUrl().contains(recherche)).findAny().isPresent()) {
					return message;
				}
			}
		}
		
		return null;
	}
	
}
