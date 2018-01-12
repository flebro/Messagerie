package com.messagerie.message;

public class Couleur extends ElementComposite {
	
	private String couleurHex;

	public String getCouleurHex() {
		return couleurHex;
	}

	public void setCouleurHex(String couleurHex) {
		this.couleurHex = couleurHex;
	}
	
	@Override
	protected String getDebutToString() {
		return "<font color='"+ couleurHex + "'>";
	}

	@Override
	protected String getFinToString() {
		return "</font>";
	}

}
