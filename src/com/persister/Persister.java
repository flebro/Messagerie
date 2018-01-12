package com.persister;

import java.util.List;

import com.messagerie.message.IMessage;

public abstract class Persister {
	
	 public boolean sauvegarder(List<IMessage> list) {
		System.out.println("Liste des messages enregistrés");
		list.forEach(System.out::println);
		return true;
	}

}
