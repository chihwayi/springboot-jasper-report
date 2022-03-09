package com.covidapp.screening.entities;

public class BaselineTests {
	int temperature;
	String coughing;
	String fever;
	String lungPain;
	String dateTested;
	
	public BaselineTests() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BaselineTests(int temperature, String coughing, String fever, String lungPain, String dateTested) {
		super();
		this.temperature = temperature;
		this.coughing = coughing;
		this.fever = fever;
		this.lungPain = lungPain;
		this.dateTested = dateTested;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public String isCoughing() {
		return coughing;
	}

	public void setCoughing(String coughing) {
		this.coughing = coughing;
	}

	public String isFever() {
		return fever;
	}

	public void setFever(String fever) {
		this.fever = fever;
	}

	public String isLungPain() {
		return lungPain;
	}

	public void setLungPain(String lungPain) {
		this.lungPain = lungPain;
	}

	public String getDateTested() {
		return dateTested;
	}

	public void setDateTested(String dateTested) {
		this.dateTested = dateTested;
	}
	
	
	

}
