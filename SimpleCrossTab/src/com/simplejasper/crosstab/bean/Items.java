package com.simplejasper.crosstab.bean;

public class Items {
	
	String name;
	Double price;
	
	
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Items(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}
