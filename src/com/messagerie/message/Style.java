package com.messagerie.message;

public class Style extends ElementComposite {
	
	private String tag;

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Override
	protected String getDebutToString() {
		return "<" + tag + ">";
	}

	@Override
	protected String getFinToString() {
		return "</" + tag + ">";
	}
	
	

}
