package com.messagerie.message;

public class Lien extends ElementComposite {
	
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Lien() {}
	
	public Lien(String url) {
		this.url = url;
	}
	
	@Override
	protected String getDebutToString() {
		return "<a href='"+ url + "'>";
	}

	@Override
	protected String getFinToString() {
		return "</a>";
	}
	
}
