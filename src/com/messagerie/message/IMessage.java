package com.messagerie.message;

import java.util.List;

import com.messagerie.formatting.IMessageFormatter;

public interface IMessage {
	
	void formatter(IMessageFormatter f);
	
	List<Texte> getElements();
	
}
