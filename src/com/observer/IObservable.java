package com.observer;

public interface IObservable {

	void ajouterObservateur(IObservateur o);
	void enleverObservateur(IObservateur o);
	void notifierObservateur();
}
