package org.ssglobal.training.codes.itemA;

import java.util.ArrayList;
import java.util.List;

public class PLDTPhones {
	private List<String> phoneNumbers = new ArrayList<>();
	
	public void addPhoneNumber(String phoneNumber) {
		if (phoneNumbers.size() <= 10000) {
			phoneNumbers.add(phoneNumber);
		}
	}
	
	public void removePhoneNumber(String phoneNumber) {
		if (!phoneNumbers.isEmpty()) {
			phoneNumbers.remove(phoneNumber);
		}
	}
	
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
}
