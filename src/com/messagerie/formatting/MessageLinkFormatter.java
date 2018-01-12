package com.messagerie.formatting;

import com.messagerie.message.Lien;

public class MessageLinkFormatter extends MessageFormatter<Lien> {

	public MessageLinkFormatter() {
		super("[url", "[/url]");
	}
	
	@Override
	protected Lien buildElement(String data) {
		return new Lien(data.substring(5, data.length() - 1));
	}

}
