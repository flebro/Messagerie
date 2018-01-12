package com.messagerie;

import com.master.recherche.Chercheur;
import com.master.recherche.CouleurChercheur;
import com.master.recherche.LinkChercheur;
import com.master.recherche.TexteChercheur;
import com.messagerie.command.ICommand;
import com.messagerie.command.Rechercher;
import com.messagerie.formatting.IMessageFormatter;
import com.messagerie.formatting.MessageBoldFormatter;
import com.messagerie.formatting.MessageColorFormatter;
import com.messagerie.formatting.MessageFormatter;
import com.messagerie.formatting.MessageLinkFormatter;
import com.messagerie.message.Message;

public class Program {
	
	private ICommand<String> rechercherCommand;

	public static void main(String[] args) {
		Program p = new Program();
		p.start();
	}
	
	public void start() {
		// Initialisation des chercheurs
		//Chercheur chercheur = new CouleurChercheur().setSuivant(new LinkChercheur().setSuivant(new TexteChercheur()));
		
		// Initialisation des commandes
		//rechercherCommand = new Rechercher(chercheur);
		
		MessageColorFormatter messageColorFormatter = new MessageColorFormatter();
		MessageLinkFormatter messageLinkFormatter = new MessageLinkFormatter();
		IMessageFormatter messageFormatter = new MessageBoldFormatter();
		Message test = new Message("bla blab [color=#000000] [url=truc] fzhinhgz [/url]  [color=#000001] kfzij [/color] totot [/color] fvazjbvjbzv fsqc [b] zrgzvrzvrzv [/b]");
		test.formatter(messageColorFormatter);
		test.formatter(messageLinkFormatter);
		test.formatter(messageFormatter);
		System.out.println(test.toString());
	}

}
