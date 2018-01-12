package com.master.recherche;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.messagerie.Salon;
import com.messagerie.message.Element;
import com.messagerie.message.ElementComposite;
import com.messagerie.message.IMessage;

public abstract class Chercheur {
	
	private Chercheur _suivant;
	
	private final Predicate<String> _predicatDeclenchement;
	private final BiPredicate<Element, String> _predicatRecherche;
	
	public Chercheur setSuivant(Chercheur suivant) {
		_suivant = suivant;
		return this;
	}
	
	public Chercheur(Predicate<String> predicatDeclenchement, BiPredicate<Element, String> predicatRecherche) {
		_predicatDeclenchement = predicatDeclenchement;
		_predicatRecherche = predicatRecherche;
	}
	
	public IMessage rechercher(String recherche) {
		Salon salon = Salon.getInstance(); 
		IMessage resultat = null;
		if (_predicatDeclenchement.test(recherche)) {
			for (IMessage message : salon.getMessages()) {
				if (found(message.getElements(), recherche)) {
					resultat = message;
					break;
				}
			}
		}
		if (resultat == null && _suivant != null) {
			return _suivant.rechercher(recherche);
		}
		return resultat;
	}
	
	protected boolean found(List<Element> elements, String recherche) {
		for (Element element : elements) {
			if (_predicatRecherche.test(element, recherche)) {
				return true;
			} 
			if (element instanceof ElementComposite) {
				if (found(((ElementComposite) element).getChildren(), recherche)) {
					return true;
				}
			}
		}
		return false;
	}

}
