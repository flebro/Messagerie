package com.messagerie.message;

import java.util.List;

public interface IMessage {
	
	public void formatter(IMessageFormatter f);
	
	List<Texte> getElements();

}
