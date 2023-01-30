package org.ssglobal.training.codes.itemA;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiCalendar {
	private Map<LocalDate, List<String>> calendar = new HashMap<>();
	LocalDate date = LocalDate.now();
	
	public void addEvent(List<String> events) {
		calendar.put(date, events);
	}
	
	public Map<LocalDate, List<String>> getCalendar() {
		return calendar;
	}
}
