package com.messagerie.command;

import com.messagerie.Salon;
import com.persister.HTMLPersister;

public class EnregistrerHTML implements ICommand<Void> {

	HTMLPersister htmlPersister;

	public EnregistrerHTML(HTMLPersister htmlPersister) {
		super();
		this.htmlPersister = htmlPersister;
	}

	@Override
	public void execute(Void param) {
		htmlPersister.sauvegarder(Salon.getInstance().getMessages());
	}
	

}
