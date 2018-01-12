package com.master.recherche;

import com.messagerie.message.Lien;

public class LinkChercheur extends Chercheur {

	public LinkChercheur() {
		super(recherche -> isLien(recherche), 
				(element, recherche) -> element instanceof Lien && ((Lien) element).getUrl().contains(recherche));
	}
		
}
