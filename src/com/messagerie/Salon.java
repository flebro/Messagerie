package com.messagerie;

import java.util.ArrayList;
import java.util.List;

import com.messagerie.formatting.IMessageFormatter;
import com.messagerie.formatting.MessageBoldFormatter;
import com.messagerie.formatting.MessageColorFormatter;
import com.messagerie.formatting.MessageLinkFormatter;
import com.messagerie.message.IMessage;
import com.messagerie.message.proxy.ListMessage;
import com.observer.IObservable;
import com.observer.IObservateur;

public class Salon implements IObservable{
	
	private static Salon _instance;
	
	private List<IMessage> messages;
	private List<IObservateur> observateurs;
	private List<IMessageFormatter> formatters;
	
	public List<IMessage> getMessages() {
		return messages;
	}

	public void setMessages(List<IMessage> messages) {
		this.messages = messages;
	}

	private Salon() {
		messages = new ListMessage(5);
		observateurs= new ArrayList<>();
		formatters=new ArrayList<>();
		formatters.add(new MessageBoldFormatter());
		formatters.add(new MessageLinkFormatter());
		formatters.add(new MessageColorFormatter());
	}
	
	public static Salon getInstance() {
		if (_instance == null) {
			_instance = new Salon();
		}
		return _instance;
	}
	
	public void publie(IMessage message) {
		formatters.forEach(f -> message.formatter(f));
		messages.add(message);
		notifierObservateur(message);
	}
	
	public void loadHistorique() {
		((ListMessage) messages).loadPage();
		messages.forEach(m -> notifierObservateur(m));
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
	public void notifierObservateur(IMessage nouveauMessage) {
		for (IObservateur observer : this.observateurs) {
			observer.actualiser(nouveauMessage);
		}
	}

}
