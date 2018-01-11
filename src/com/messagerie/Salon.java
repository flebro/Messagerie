package com.messagerie;

import java.util.List;

import com.messagerie.message.IMessage;
import com.messagerie.message.proxy.ListMessage;

public class Salon {
	
	private static Salon _instance;
	
	private List<IMessage> messages;
	
	public List<IMessage> getMessages() {
		return messages;
	}

	public void setMessages(List<IMessage> messages) {
		this.messages = messages;
	}

	private Salon() {
		messages = new ListMessage(20);
	}
	
	public static Salon getInstance() {
		if (_instance == null) {
			_instance = new Salon();
		}
		return _instance;
	}
	
	public void publie(IMessage message) {
		messages.add(message);
		// Ici on notifie les utilisateurs
	}
	
	public void loadHistorique() {
		((ListMessage) messages).loadPage();
	}

}
