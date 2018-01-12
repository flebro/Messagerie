package com.messagerie.message;

import java.util.List;

import com.messagerie.formatting.IMessageFormatter;

public interface IMessage {
	
	void formatter(IMessageFormatter f);
	
	List<Element> getElements();
	void setElements(List<Element> elements);
	
}
