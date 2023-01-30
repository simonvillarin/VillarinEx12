package org.ssglobal.training.codes.itemA;

import java.util.ArrayList;
import java.util.List;

public class DeckCards {
	private List<Object> deck = new ArrayList<>();
	
	public void drawCard() {
		int size = deck.size();
		
		if (size != 0) {
			deck.get(size - 1);
		}
	}
	
	public void returnCard(String card) {
		deck.add(0, card);
	}
	
	public List<Object> getDeck() {
		return deck;
	}
}
