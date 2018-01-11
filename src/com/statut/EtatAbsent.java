package com.statut;

import java.util.ArrayList;

import com.messagerie.message.IMessage;

public class EtatAbsent extends Etat {
	
	ArrayList<IMessage> messagesEnAttente;
	
	public ArrayList<IMessage> getMessagesEnAttente() {
		return messagesEnAttente;
	}
	
	public EtatAbsent() {
		this.messagesEnAttente = new ArrayList<>();
	}

}
