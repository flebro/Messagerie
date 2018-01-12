package com.messagerie.formatting;

import com.messagerie.message.Style;

public class MessageBoldFormatter extends MessageFormatter<Style> {
	
	public MessageBoldFormatter() {
		super("[b]", "[/b]");
	}

	@Override
	protected Style buildElement(String data) {
		return new Style("b");
	}
	
}
