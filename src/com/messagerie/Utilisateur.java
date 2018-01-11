package com.messagerie;

import com.observer.IObservable;
import com.observer.IObservateur;
import com.statut.Etat;

public class Utilisateur implements IObservateur {
	
	Etat etat;

	public Utilisateur(Etat etat) {
		super();
		this.etat = etat;
	}

	@Override
	public void actualiser(IObservable o) {
		// afficher message
		System.out.println("afffichage des messages pour les utilisateurs");
		//if(etat.)
		

	}
	
	public void setPresent() {
		etat.setPresent(this);
	}
	
	public void setAbsent() {
		etat.setAbsent(this);
		
	}

}
