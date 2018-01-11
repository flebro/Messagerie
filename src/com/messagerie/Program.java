package com.messagerie;

import com.master.recherche.Chercheur;
import com.master.recherche.CouleurChercheur;
import com.master.recherche.LinkChercheur;
import com.master.recherche.TexteChercheur;
import com.messagerie.command.ICommand;
import com.messagerie.command.Rechercher;

public class Program {
	
	private ICommand<String> rechercherCommand;

	public static void main(String[] args) {
		Program p = new Program();
		p.start();
	}
	
	public void start() {
		// Initialisation des chercheurs
		Chercheur chercheur = new CouleurChercheur().setSuivant(new LinkChercheur().setSuivant(new TexteChercheur()));
		
		// Initialisation des commandes
		rechercherCommand = new Rechercher(chercheur);
	}

}
