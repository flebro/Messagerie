package com.messagerie;

import com.messagerie.command.EnregistrerDB;
import com.messagerie.command.EnregistrerHTML;
import com.messagerie.command.EnregistrerJSON;
import com.messagerie.command.ICommand;
import com.messagerie.command.PagePrecedente;
import com.messagerie.command.Publier;
import com.messagerie.command.Rechercher;
import com.messagerie.message.IMessage;
import com.messagerie.message.Message;
import com.persister.DBPersister;
import com.persister.HTMLPersister;
import com.persister.JSONPersister;

public class Program {

	private ICommand<String> rechercherCommand;
	private ICommand<IMessage> publierCommand;
	private ICommand<Void> pagePrecCommand;
	private ICommand<Void> enregistrerDbCommand;
	private ICommand<Void> enregistrerHtmlCommand;
	private ICommand<Void> enregistrerJsonCommand;

	public static void main(String[] args) {
		Program p = new Program();
		p.start();
	}

	public void start() {
		init();
		test();
	}

	public void test() {
		// On créé des utilisateurs
		Utilisateur bob = new Utilisateur("bob");
		Utilisateur jack = new Utilisateur("jack");
		Utilisateur anne = new Utilisateur("anne");
		
		// On set un utilisateur absent
		anne.setAbsent();
		
		// On les inscrit
		Salon instance = Salon.getInstance();
		instance.ajouterObservateur(bob);
		instance.ajouterObservateur(anne);
		instance.ajouterObservateur(jack);
		
		// On publie des messages
		Message message = new Message("je suis un [b] message [/b]", bob);
		publierCommand.execute(message);
		
		message = new Message("[color=#000000] salut bob ! [/color]", jack);
		publierCommand.execute(message);
		
		// Changement de statut
		System.out.println("---- CHANGEMENT DE STATUT UTILISATEUR");
		anne.setPresent();
		
		// Chargement de page
		System.out.println("---- RECUPERATION HISTORIQUE");
		pagePrecCommand.execute(null);
		
		// Recherche
		System.out.println("---- RECHERCHE");
		rechercherCommand.execute("#000000");
		
		// Enregistrement
		System.out.println("---- ENREGISTREMENT");
		enregistrerHtmlCommand.execute(null);
		
	}

	public void init() {
		// Initialisation des commandes
		publierCommand = new Publier();
		rechercherCommand = new Rechercher();
		pagePrecCommand = new PagePrecedente();
		enregistrerDbCommand = new EnregistrerDB(new DBPersister());
		enregistrerHtmlCommand = new EnregistrerHTML(new HTMLPersister());
		enregistrerJsonCommand = new EnregistrerJSON(new JSONPersister());
	}

}
