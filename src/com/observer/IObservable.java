package com.observer;

import java.util.List;

import com.messagerie.message.IMessage;

public interface IObservable {

	void ajouterObservateur(IObservateur o);
	void enleverObservateur(IObservateur o);
	void notifierObservateur(IMessage nouveauMessage);
}
