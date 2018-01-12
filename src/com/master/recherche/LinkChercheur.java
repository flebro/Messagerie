package com.master.recherche;

import com.messagerie.message.Lien;
import com.messagerie.message.Message;

public class LinkChercheur extends Chercheur {

	public LinkChercheur() {
		super(recherche -> Message.isLien(recherche), 
				(element, recherche) -> element instanceof Lien && ((Lien) element).getUrl().contains(recherche));
	}
		
}
