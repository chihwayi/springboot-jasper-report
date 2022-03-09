package com.covidapp.screening.entities;

public class Faculty {
	
	String facultyName;
	String programName;
	String programLevel;
	
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Faculty(String facultyName, String programName, String programLevel) {
		super();
		this.facultyName = facultyName;
		this.programName = programName;
		this.programLevel = programLevel;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getProgramLevel() {
		return programLevel;
	}

	public void setProgramLevel(String programLevel) {
		this.programLevel = programLevel;
	}
	
	

}
