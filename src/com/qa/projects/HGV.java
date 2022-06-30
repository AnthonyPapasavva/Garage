package com.qa.projects;

public class HGV extends Vehicle {

	private String speedCap;
	private String height;

	public HGV() {
		super(10, 3, true, "vroom", "- life savings");
		this.speedCap = "60 mph";
		this.height = "5 metres";

	}

//	public HGV(int numOfWheels, int numOfPassengers, boolean hasSeatbelts, String makeNoise, String fuelType,
//			String speedCap, String height) {
//		super(10, 3, true, "vroom", "- life savings");
//	}

	public String getSpeedCap() {
		return speedCap;
	}

	public void setSpeedCap(String speedCap) {
		this.speedCap = speedCap;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

}
