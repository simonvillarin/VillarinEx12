package org.ssglobal.training.codes.itemA;

import java.util.Map;
import java.util.TreeMap;

public class Promotion {
	private Map<Integer, String> performanceSheet = new TreeMap<>();
	
	public void addRecord(int performanceScore, String name) {
		performanceSheet.put(performanceScore, name);
	}
	
	public void eligibleForPromotion() {
		System.out.println("Employees eligible for promotion: ");
		 
        for (Map.Entry<Integer, String> employee: performanceSheet.entrySet()) {
            System.out.println("%s".formatted(employee.getValue()));
        }
	}
}
