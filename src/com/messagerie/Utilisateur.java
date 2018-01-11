package com.messagerie;

import com.messagerie.message.IMessage;
import com.observer.IObservable;
import com.observer.IObservateur;
import com.statut.Etat;
import com.statut.EtatAbsent;
import com.statut.EtatPresent;

public class Utilisateur implements IObservateur {
	
	Etat etat;

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public Utilisateur(Etat etat) {
		super();
		this.etat = etat;
	}

	@Override
	public void actualiser(IObservable o) {
		// afficher message
		if (etat instanceof EtatPresent) {
			
		} else if (etat instanceof EtatAbsent) {
			
		}
		
		System.out.println("afffichage des messages pour les utilisateurs");
		//if(etat.)
		

	}
	
	public void affiche(IMessage message) {
		System.out.println(message.toString());
	}
	
	public void setPresent() {
		etat.setPresent(this);
	}
	
	public void setAbsent() {
		etat.setAbsent(this);
	}

}
