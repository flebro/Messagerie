package com.messagerie.message.proxy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

import com.messagerie.Utilisateur;
import com.messagerie.message.IMessage;
import com.messagerie.message.Message;

public class ListMessage extends ArrayList<IMessage> {

	private final int _elementsParPage;
	private List<IMessage> _dataSource;
	
	public ListMessage(int elementsParPage) {
		_elementsParPage = elementsParPage;
		_dataSource = new ArrayList<>();
		loadPage();
	}
	
	@Override
	public Iterator<IMessage> iterator() {
		return _dataSource.iterator();
	}
	
	@Override
	public void forEach(Consumer<? super IMessage> action) {
		_dataSource.forEach(action);
	}
	
	@Override
	public boolean add(IMessage e) {
		return _dataSource.add(e);
	}
	
	public void loadPage() {
		for (int i=0; i < _elementsParPage ; i++) {
			Utilisateur randomUser = new Utilisateur(randomString().substring(0, 4));
			_dataSource.add(0, new Message(randomString(), randomUser));
		}
	}
	
	private String randomString() {
		return UUID.randomUUID().toString();
	}

	
}
