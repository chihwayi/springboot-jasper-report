package com.covidapp.screening.services;

public class TimeValidator {
	
	// Method Oveloading
	
	public String checkTimer(int time) {
		String decision = "";
		int timeCompare = 1200;
		
		if(time > timeCompare) {
			decision = "Deny";
		}
		
		else {
			decision = "Allow";
		}
		
		return decision;
	}
	
	public String checkTimer(int time, String entrance) {
		String decision = "";
		int timeCompare = 1700;
		
		if(time > timeCompare & entrance.equalsIgnoreCase("Part Time")) {
			decision = "Allow";
		}
		
		else {
			decision = "Deny";
		}
		
		return decision;
	}

}
