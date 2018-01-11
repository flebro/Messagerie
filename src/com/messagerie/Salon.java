package com.messagerie;

import java.util.List;

import com.messagerie.message.IMessage;
import com.observer.IObservable;
import com.observer.IObservateur;

public class Salon implements IObservable{
	
	private static Salon _instance;
	
	private List<IMessage> messages;
	private List<IObservateur> observateurs;
	
	public List<IMessage> getMessages() {
		return messages;
	}

	public void setMessages(List<IMessage> messages) {
		this.messages = messages;
	}

	private Salon() {
		
	}
	
	public static Salon getInstance() {
		if (_instance == null) {
			_instance = new Salon();
		}
		return _instance;
	}
	
	public void publie(IMessage message) {
		
	}

	@Override
	public void ajouterObservateur(IObservateur o) {
		this.observateurs.add(o);
		
	}

	@Override
	public void enleverObservateur(IObservateur o) {
		this.observateurs.remove(0);
		
	}

	@Override
	public void notifierObservateur() {
		for (IObservateur observer : this.observateurs) {
			observer.actualiser(this);
		}
	}

}
