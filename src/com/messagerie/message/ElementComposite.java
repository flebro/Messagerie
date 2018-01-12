package com.messagerie.message;

import java.util.ArrayList;
import java.util.List;

public abstract class ElementComposite extends Element {
	
	private List<Element> children = new ArrayList<>();
	
	public List<Element> getChildren() {
		return children;
	}
	
	public void setChildren(List<Element> children) {
		this.children = children;
	}

	public boolean addChildren(Element element) {
		return children.add(element);
	}
	
	protected abstract String getDebutToString();
	protected abstract String getFinToString();
	
	@Override
	public String toString() {
		return getDebutToString() + Element.join(children) + getFinToString();
	}

}
