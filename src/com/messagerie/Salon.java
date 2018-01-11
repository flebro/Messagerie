package com.messagerie;

public class Salon {
	
	private static Salon _instance;
	
	private Salon() {
		
	}
	
	public static Salon getInstance() {
		if (_instance == null) {
			_instance = new Salon();
		}
		return _instance;
	}

}
