package com.messagerie.formatting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.messagerie.message.Element;
import com.messagerie.message.ElementComposite;
import com.messagerie.message.IMessage;
import com.messagerie.message.Texte;

public abstract class MessageFormatter<T extends ElementComposite> implements IMessageFormatter {
	
	private final String _baliseOuvrante;
	private final String _baliseFermante;
	
	
	public MessageFormatter(String baliseOuvrante, String baliseFermante) {
		_baliseOuvrante = baliseOuvrante;
		_baliseFermante = baliseFermante;
	}
	
	@Override
	public void appliquer(IMessage m) {
		List<Element> elements = new ArrayList<>();
		for (Element element : m.getElements()) {
			elements.addAll(bidule(element));
		}
		m.setElements(elements);
	}

	public List<Element> bidule(Element element) {
		List<Element> elements = new ArrayList<>();

		if (element instanceof Texte) {
			elements.addAll(bidulePart(Arrays.asList(((Texte) element).getContenu().split(" "))));
		} else if (element instanceof ElementComposite) {
			ElementComposite elementComposite = (ElementComposite) element;
			List<Element> children = new ArrayList<>(); 
			for (Element enfant : ((ElementComposite) element).getChildren()) {
				children.addAll(bidule(enfant));
			}
			elementComposite.setChildren(children);
			elements.add(elementComposite);
		}
		return elements;
	}

	public List<Element> bidulePart(List<String> parts) {
		List<Element> elements = new ArrayList<>();
		List<String> partsTraitees = new ArrayList<>();
		T elementEnCours = null;

		for (int i = 0; i < parts.size(); i++) {
			String part = parts.get(i);
			
			if (isBalise(part)) {
				if (partsTraitees.size() > 0) {
					elements.add(new Texte(partsTraitees));
				}
				if (part.length() == 1) {
					// balise fermante
					return elements;
				} else {
					// balise ouvrante
					elementEnCours = buildElement(part);
					int j = parts.size() -1;
					while (j > i && !isBaliseFermante(parts.get(j))) {
						j--;
					}
					if (j != i) {
						elementEnCours.getChildren().addAll(bidulePart(parts.subList(i + 1, j)));
					}
					
					elements.add(elementEnCours);
					i = j;
				}
				partsTraitees.clear();
			} else {
				partsTraitees.add(part);
			}
		}
		if (partsTraitees.size() > 0) {
			elements.add(new Texte(partsTraitees));
		}
		return elements;
	}
	
	protected abstract T buildElement(String data);
	
	private boolean isBalise(String str) {
		return isBaliseOuvrante(str) || isBaliseFermante(str);
	}
	
	private boolean isBaliseOuvrante(String str) {
		return str.startsWith(_baliseOuvrante);
	}
	
	private boolean isBaliseFermante(String str) {
		return str.equals(_baliseFermante);
	}

}
