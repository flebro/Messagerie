package com.messagerie.message.proxy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

import com.messagerie.message.IMessage;
import com.messagerie.message.Message;

public class ListMessage extends ArrayList<IMessage> {

	private final int _elementsParPage;
	private List<IMessage> _dataSource;
	
	public ListMessage(int elementsParPage) {
		_elementsParPage = elementsParPage;
	}
	
	@Override
	public Iterator<IMessage> iterator() {
		// TODO Auto-generated method stub
		return super.iterator();
	}
	
	@Override
	public void forEach(Consumer<? super IMessage> action) {
		// TODO Auto-generated method stub
		super.forEach(action);
	}
	
	public void loadPage() {
		if (_dataSource == null) {
			_dataSource = new ArrayList<>();
			for (int i=0; i < _elementsParPage ; i++) {
				_dataSource.add(new Message(UUID.randomUUID().toString()));
			}
		}
	}

	
}
