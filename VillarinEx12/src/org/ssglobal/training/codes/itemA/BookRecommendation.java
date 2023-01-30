package org.ssglobal.training.codes.itemA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRecommendation {
	private Map<String, List<String>> library = new HashMap<>();

	public void addRecommendation(String readerPreference, List<String> recommendedBooks) {
		library.put(readerPreference, recommendedBooks);
	}

	public List<String> getRecommendations(String readerPreference) {
		return library.get(readerPreference);
	}
	
	public Map<String, List<String>> getLibrary() {
		return library;
	}
}
