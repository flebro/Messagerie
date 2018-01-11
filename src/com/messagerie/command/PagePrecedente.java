package com.messagerie.command;

import com.messagerie.Salon;

public class PagePrecedente implements ICommand<Void> {
	
	@Override
	public void execute(Void param) {
		Salon.getInstance().loadHistorique();
	}

}
