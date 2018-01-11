package com.messagerie.command;

import com.master.recherche.Chercheur;
import com.messagerie.message.IMessage;

public class Rechercher implements ICommand<String> {
	
	private Chercheur _chercheur;
	
	public Rechercher(Chercheur chercheur) {
		_chercheur = chercheur;
	}
	
	@Override
	public void execute(String param) {
		IMessage message = _chercheur.rechercher(param);
		if (message != null ) {
			// TODO afficher message
		}
	}

}
