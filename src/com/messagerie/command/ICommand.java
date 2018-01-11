package com.messagerie.command;

public interface ICommand<T> {
	
	void execute(T param);

}
