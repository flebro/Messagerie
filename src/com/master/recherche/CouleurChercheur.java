package com.master.recherche;

import com.messagerie.message.Couleur;

public class CouleurChercheur extends Chercheur {

	public CouleurChercheur() {
		super(recherche -> isCouleur(recherche), 
				(element, recherche) -> element instanceof Couleur && ((Couleur) element).getCouleurHex().contains(recherche));
	}
	
}
