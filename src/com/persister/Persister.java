package com.persister;

import java.util.List;

import com.messagerie.message.IMessage;
import com.messagerie.message.Message;

public abstract class Persister {
	
	 public boolean sauvegarder(List<IMessage> list) {
		System.out.println("Liste des messages enregistrer");
		return false;
	}

}
