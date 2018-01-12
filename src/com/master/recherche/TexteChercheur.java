package com.master.recherche;

import com.messagerie.message.Message;
import com.messagerie.message.Texte;

public class TexteChercheur extends Chercheur {
	
	public TexteChercheur() {
		super(recherche -> !Message.isLien(recherche) && !Message.isCouleur(recherche), 
				(element, recherche) -> element instanceof Texte && ((Texte) element).getContenu().contains(recherche));
	}

}
