package org.ssglobal.training.codes.itemA;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
	private List<Object> invoice = new ArrayList<>();
	
	public void addItems(String productName, int quantity, double price) {
		List<Object> itemList = new ArrayList<>();
		itemList.add(productName);
		itemList.add(quantity);
		itemList.add(price);		
		invoice.add(itemList);
	}
	
	public List<Object> getInvoice() {
		return invoice;
	}
}
