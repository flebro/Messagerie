package com.master.recherche;

import java.util.List;

import com.messagerie.message.IMessage;

public class TexteChercheur extends Chercheur {
	@Override
	protected IMessage trouve(List<IMessage> messages, String recherche) {
		if (!isLien(recherche) && !isCouleur(recherche)) {
			for (IMessage message : messages) {
				if (message.getElements().stream().filter(e -> e.getContenu().contains(recherche)).findAny().isPresent()) {
					return message;
				}
			}
		}
		return null;
	}
}
