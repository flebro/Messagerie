package com.messagerie.command;

import com.messagerie.Salon;
import com.persister.DBPersister;

public class EnregistrerDB implements ICommand<Void> {
		
	DBPersister dbpersister;
	
	public EnregistrerDB(DBPersister dbpersister) {
		this.dbpersister = dbpersister;
	}


	@Override
	public void execute(Void param) {
		dbpersister.sauvegarder(Salon.getInstance().getMessages());		
	}

}
