package com.teamcity.demo;

public class Car {
	private String brand; 
	private String model;
	
	public Car(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	public String toString() { 
	    return "Brand: '" + this.brand + "', Model: '" + this.model + "'";
	} 		
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	} 

}
