package com.messagerie.message;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Element {
	
	public static String join(List<Element> elements) {
		return String.join("", elements.stream().map(Element::toString).collect(Collectors.toList()));
	}

}
