package com.company.models;

import java.util.Set;

public class ParkingSpace {
	private String ID;
	private double volume;
	private Person primaryOwner;
	private Set<Item> items;
	private Set<Vehicle> vehicles;
	public static int count = 0;

	public ParkingSpace(double length, double breadth, double height){
		this.ID = "PKG-" + ++count;
		this.volume = length*breadth*height;
	}

	public ParkingSpace(double volume){
		this.ID = "PKG-" + ++count;
		this.volume = volume;
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public void removeItem(Item item){
		items.remove(item);
	}

	public void addVehicle(Vehicle vehicle){
		vehicles.add(vehicle);
	}

	public void removeVehicle(Vehicle vehicle){
		vehicles.remove(vehicle);
	}
}
