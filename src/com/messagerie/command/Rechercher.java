package com.messagerie.command;

import com.master.recherche.Chercheur;
import com.master.recherche.CouleurChercheur;
import com.master.recherche.LinkChercheur;
import com.master.recherche.TexteChercheur;
import com.messagerie.message.IMessage;

public class Rechercher implements ICommand<String> {
	
	private Chercheur _chercheur;
	
	public Rechercher() {
		_chercheur = new CouleurChercheur().setSuivant(new LinkChercheur().setSuivant(new TexteChercheur()));
	}
	
	@Override
	public void execute(String param) {
		IMessage message = _chercheur.rechercher(param);
		if (message != null ) {
			System.out.println(message.toString());
		}
	}

}
