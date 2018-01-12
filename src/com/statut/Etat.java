package com.statut;

import com.messagerie.Utilisateur;
import com.messagerie.message.IMessage;

public abstract class Etat {
	

	protected void setEtat(Utilisateur u,Etat e) {
		u.setEtat(e);
	}
	
	public void setPresent(Utilisateur u) {
		if (u.getEtat() instanceof EtatAbsent) {
			for (IMessage enAttente : ((EtatAbsent) u.getEtat()).getMessagesEnAttente()) {
				
			}
		}
		
		setEtat(u, new EtatPresent());
	}
	
	public void setAbsent(Utilisateur u) {
		setEtat(u, new EtatAbsent());
	}
}
