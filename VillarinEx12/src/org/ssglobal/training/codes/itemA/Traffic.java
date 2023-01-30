package org.ssglobal.training.codes.itemA;

import java.util.HashMap;
import java.util.Map;

public class Traffic {
	private Map<String, Integer> trafficData = new HashMap<>();
	
	public void addTrafficData(String route, int numOfVehicles) {
		trafficData.put(route, numOfVehicles);
	}
	
	public Integer getTrafficData(String route) {
		return trafficData.get(route);
	}
}
