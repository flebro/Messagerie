package com.observer;

import com.messagerie.message.IMessage;

public interface IObservateur {
	
	void actualiser(IMessage m);

}
