package com.qa.projects;

public class Vehicle {

	private int numOfWheels;
	private int numOfPassengers;
	private boolean hasSeatbelts;
	private String makeNoise;
	private String fuelType;

	public Vehicle(int numOfWheels, int numOfPassengers, boolean hasSeatbelts, String makeNoise, String fuelType) {
		this.numOfWheels = numOfWheels;
		this.numOfPassengers = numOfPassengers;
		this.hasSeatbelts = hasSeatbelts;
		this.makeNoise = makeNoise;
		this.fuelType = fuelType;
	}

	public void fuelType() {
		System.out.println("Check Vehicle Type");
	}

	public void makeNoise() {
		System.out.println(makeNoise);
	}

	public int getNumOfWheels() {
		return this.numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public int getNumOfPassengers() {
		return this.numOfPassengers;
	}

	public void setNumOfPassengers(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
	}

	public boolean getHasSeatbelts() {
		return this.hasSeatbelts;
	}

	public void setHasSeatbelts(boolean hasSeatbelts) {
		this.hasSeatbelts = hasSeatbelts;
	}

	public String getmakeNoise() {
		return this.makeNoise;
	}

	public void setmakeNoise(String makeNoise) {
		this.makeNoise = makeNoise;
	}

	public String getFuelType() {
		return this.fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
}
