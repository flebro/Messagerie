package com.master.recherche;

import com.messagerie.message.Couleur;
import com.messagerie.message.Message;

public class CouleurChercheur extends Chercheur {

	public CouleurChercheur() {
		super(recherche -> Message.isCouleur(recherche), 
				(element, recherche) -> element instanceof Couleur && ((Couleur) element).getCouleurHex().contains(recherche));
	}
	
}
