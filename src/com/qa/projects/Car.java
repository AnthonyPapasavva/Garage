package com.qa.projects;

public class Car extends Vehicle {

	private String model;
	private boolean sunroof;

	public Car(String model, boolean sunroof, String fuelType) {
		super(4, 5, true, "purr", fuelType);
		this.model = model;
		this.sunroof = sunroof;
	}

	public Car() {
		super(4, 5, true, "purr", null);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean getSunroof() {
		return sunroof;
	}

	public void setSunroof(boolean sunroof) {
		this.sunroof = sunroof;
	}

}
