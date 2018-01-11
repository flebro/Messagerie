package com.messagerie.message;

public class Lien extends Texte {
	
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "<a href='"+ url + "'>" + super.toString() + "</a>";
	}
	
}
