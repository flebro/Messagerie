package com.messagerie.command;

import com.messagerie.Salon;
import com.persister.JSONPersister;

public class EnregistrerJSON implements ICommand<Void>{

	JSONPersister jsonPersister;

	public EnregistrerJSON(JSONPersister jsonPersister) {
		this.jsonPersister = jsonPersister;
	}

	@Override
	public void execute(Void param) {
		jsonPersister.sauvegarder(Salon.getInstance().getMessages());
	}
	 
	

}
