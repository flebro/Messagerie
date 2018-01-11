package com.master.recherche;

import java.util.List;

import com.messagerie.Salon;
import com.messagerie.message.IMessage;

public abstract class Chercheur {
	
	private static final String PATTERN_COULEUR = "#";
	private static final String PATTERN_LIEN = "http://";
	
	private Chercheur _suivant;
	
	public void setSuivant(Chercheur suivant) {
		_suivant = suivant;
	}
	
	public IMessage rechercher(String recherche) {
		Salon salon = Salon.getInstance(); 
		IMessage resultat = trouve(salon.getMessages(), recherche);
		if (resultat == null && _suivant != null) {
			return _suivant.trouve(salon.getMessages(), recherche);
		}
		return resultat;
	}
	
	protected abstract IMessage trouve(List<IMessage> messages, String recherche);
	
	protected final boolean isCouleur(String recherche) {
		return recherche.startsWith(PATTERN_COULEUR);
	}
	protected final boolean isLien(String recherche) {
		return recherche.startsWith(PATTERN_LIEN);
	}
}
