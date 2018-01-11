package com.messagerie.message;

public class TexteColorise extends Texte {
	
	private String couleurHex;

	public String getCouleurHex() {
		return couleurHex;
	}

	public void setCouleurHex(String couleurHex) {
		this.couleurHex = couleurHex;
	}
	
	@Override
	public String toString() {
		return "<font color='"+ couleurHex + "'>" + super.toString() + "</font>";
	}

}
