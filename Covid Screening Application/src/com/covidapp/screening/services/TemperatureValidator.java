package com.covidapp.screening.services;

public class TemperatureValidator {
	String msg;

	public String tempValidate(int temp) {
		String msg = "Allow";

		if (temp > 38) {
			msg = "Deny";
		} else {
			this.msg = msg;
		}

		return msg;
	}

}
