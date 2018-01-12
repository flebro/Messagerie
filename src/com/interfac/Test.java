package com.interfac;

import java.awt.List;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

import com.master.recherche.Chercheur;
import com.messagerie.Salon;
import com.messagerie.Utilisateur;
import com.messagerie.command.ICommand;
import com.messagerie.message.Message;
import com.statut.EtatAbsent;
import com.statut.EtatPresent;

public class Test {
	
	static Salon _Instance;
	public static void main(String[] args) {
		Chercheur chercheur;


		_Instance=Salon.getInstance();
		//_Instance.ajouterObservateur(utilisateurConnecte1);
		//_Instance.ajouterObservateur(utilisateurConnecte2);
		//_Instance.ajouterObservateur(utilisateurConnecte3);

	}

}
