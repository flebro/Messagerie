package com.messagerie.command;

import com.messagerie.Salon;
import com.messagerie.message.IMessage;

public class Publier implements ICommand<IMessage> {
	
	@Override
	public void execute(IMessage param) {
		Salon.getInstance().publie(param);
	}
}
