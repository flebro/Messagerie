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
	public void actualiser(IMessage m) {
		// afficher message
		if (etat instanceof EtatPresent) {
			System.out.println(m.toString());
		} else if (etat instanceof EtatAbsent) {
			((EtatAbsent)etat).getMessagesEnAttente().add(m);
		}
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
