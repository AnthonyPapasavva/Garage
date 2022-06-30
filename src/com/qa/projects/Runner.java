package com.qa.projects;

public class Runner {

	public static void main(String[] args) {

		Vehicle veh = new Vehicle(4, 5, true, "Start engine", "Check Vehicle Type");
		veh.makeNoise();

		Car car = new Car("Model : ", true, "Check user manual");
		car.makeNoise();

		Car tesla = new Tesla();
		System.out.println(tesla.getFuelType());
		tesla.makeNoise();

//		Car mazda = new Car();  // can play around with values if needed

		Motorcycle mot = new Motorcycle("Weeeee!", "Sidecar, for the dog", true);
		System.out.println(mot.getNumOfWheels());

		Motorcycle kawasaki = new Motorcycle("Wheelie? If you're brave enough",
				"Just because you can doesn't mean you should", true);
		System.out.println(kawasaki.getWheelie());

//		Ducati ducati = new Ducati();  // can play around with values if needed

		HGV hgv = new HGV();
		System.out.println(hgv.getSpeedCap());

		Garage gar = new Garage();
		gar.addVehicle(tesla);
		gar.addVehicle(car);
		gar.addVehicle(mot);
		gar.addVehicle(hgv);
// 		gar.addVehicle(new HGV("speedcap" + "72 metres talls"));    // playing around with values in HGV class to get this to work
		gar.listVehicles();

		gar.billAll();

		gar.emptyGarage(); // should empty garage of all vehicles.

	}

}
