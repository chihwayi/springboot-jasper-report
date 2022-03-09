package com.covidapp.screening.entities;


public class Person {
	String fname;
	String sname;
	String gender;
	int age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String fname, String sname, String gender, int age) {
		super();
		this.fname = fname;
		this.sname = sname;
		this.gender = gender;
		this.age = age;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
