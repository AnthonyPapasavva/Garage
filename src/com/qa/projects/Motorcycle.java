package com.qa.projects;

public class Motorcycle extends Vehicle {

	private String wheelie;
	private String sidecar;
	private boolean offRoad;

	public Motorcycle(String wheelie, String sidecar, boolean offRoad) {
		super(2, 2, false, "roar", "Petrol or Diesel");
		this.wheelie = wheelie;
		this.sidecar = sidecar;
		this.offRoad = offRoad;
	}

	public String getWheelie() {
		return wheelie;
	}

	public void setWheelie(String wheelie) {
		this.wheelie = wheelie;
	}

	public String getSidecar() {
		return sidecar;
	}

	public void setSidecar(String sidecar) {
		this.sidecar = sidecar;
	}

	public boolean getOffRoad() {
		return offRoad;
	}

	public void setOffRoad(boolean offRoad) {
		this.offRoad = offRoad;
	}
}
