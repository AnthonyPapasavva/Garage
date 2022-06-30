package com.qa.projects;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> garage = new ArrayList<>();

	public void addVehicle(Vehicle v) {
		garage.add(v);
	}

	public void removeVehicle(Vehicle v) {
		garage.remove(v);
	}

	public void listVehicles() {
		System.out.println(garage.toString());
	}

	public void calculateBill() {
		billAll();
	}

	public void billAll() {
		for (Vehicle v : garage) {
			if (v instanceof Tesla) {
				System.out
						.println("Find the nearest SuperCharger to fill up for free with " + ((Tesla) v).getFuelType());
			} else if (v instanceof Car) {
				System.out.println("75 per wheel, 250 total if you're buying " + ((Car) v).getNumOfWheels());
//			} else if (v instanceof Kawasaki) {				//was playing around here, need to figure out how to format so it doesn't repeat output from parent.
//			System.out.println("4,750 " + ((Kawasaki) v).getSidecar());
			} else if (v instanceof Motorcycle) {
				System.out.println("Tyres are chonky, 200 each for " + ((Motorcycle) v).getNumOfWheels());
			} else if (v instanceof HGV) {
				System.out.println("We can add Nitro for 800 to increase to 90mph up from " + ((HGV) v).getSpeedCap());
			}
		}
	}

	public void emptyGarage() {
		garage.clear();
	}
}
