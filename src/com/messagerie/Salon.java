package com.messagerie;

import java.util.List;

import com.messagerie.message.IMessage;

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
		
	}
	
	public static Salon getInstance() {
		if (_instance == null) {
			_instance = new Salon();
		}
		return _instance;
	}
	
	public void publie(IMessage message) {
		
	}

}
