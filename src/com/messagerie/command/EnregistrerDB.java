package com.messagerie.command;

import java.awt.List;

import com.messagerie.Salon;
import com.messagerie.message.Message;
import com.persister.DBPersister;

public class EnregistrerDB implements ICommand<Void> {
		
	DBPersister dbpersister;
	
	public EnregistrerDB(DBPersister dbpersister) {
		super();
		this.dbpersister = dbpersister;
	}


	@Override
	public void execute(Void param) {
		dbpersister.sauvegarder(Salon.getInstance().getMessages());		
	}

}
