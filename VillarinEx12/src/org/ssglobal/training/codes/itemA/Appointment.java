package org.ssglobal.training.codes.itemA;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Appointment {
	private Map<LocalDate, String> appointments = new HashMap<>();
	LocalDate date = LocalDate.now();

	public void addAppointment(String appointment) {
		appointments.put(date, appointment);
	}
	
	public Map<LocalDate, String> getAppointments() {
		return appointments;
	}
}
