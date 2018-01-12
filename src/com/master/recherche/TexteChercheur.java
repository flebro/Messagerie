package com.master.recherche;

import java.util.List;

import com.messagerie.message.IMessage;
import com.messagerie.message.Lien;
import com.messagerie.message.Texte;

public class TexteChercheur extends Chercheur {
	
	public TexteChercheur() {
		super(recherche -> !isLien(recherche) && !isCouleur(recherche), 
				(element, recherche) -> element instanceof Texte && ((Texte) element).getContenu().contains(recherche));
	}

}
