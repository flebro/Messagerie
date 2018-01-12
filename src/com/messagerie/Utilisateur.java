package com.messagerie;

import com.messagerie.message.IMessage;
import com.observer.IObservateur;
import com.statut.Etat;
import com.statut.EtatAbsent;
import com.statut.EtatPresent;

public class Utilisateur implements IObservateur {
	
	private String nom;
	private Etat etat;

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Utilisateur(String nom) {
		this.nom = nom;
		this.etat = new EtatPresent();
	}

	@Override
	public void actualiser(IMessage m) {
		// afficher message
		if (etat instanceof EtatPresent) {
			affiche(m);
		} else if (etat instanceof EtatAbsent) {
			((EtatAbsent)etat).getMessagesEnAttente().add(m);
		}
	}
	
	public void affiche(IMessage message) {
		System.out.println(nom + " reçoit un message >> " + message.toString());
	}
	
	public void setPresent() {
		etat.setPresent(this);
	}
	
	public void setAbsent() {
		etat.setAbsent(this);
	}

}
