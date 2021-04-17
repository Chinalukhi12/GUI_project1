package com.company.models;

import com.company.TooManyThingsException;

import java.util.HashSet;
import java.util.Set;

public class ParkingSpace extends Space{

	private Set<Item> items;
	private Set<Vehicle> vehicles;
	public static int count = 0;

	public ParkingSpace(double length, double breadth, double height){
		this.ID = "PKG-" + ++count;
		this.volume = length*breadth*height;
		this.items = new HashSet<>();
		this.vehicles = new HashSet<>();
	}

	public ParkingSpace(double volume){
		this.ID = "PKG-" + ++count;
		this.volume = volume;
		this.items = new HashSet<>();
		this.vehicles = new HashSet<>();
	}

	public void addItem(Item item) throws TooManyThingsException {
		if (volume < item.getVolume()){
			throw new TooManyThingsException();
		}
		volume -= item.getVolume();
		items.add(item);
	}

	public void removeItem(Item item){
		volume += item.getVolume();
		items.remove(item);
	}

	public void addVehicle(Vehicle vehicle) throws TooManyThingsException {
		if (volume < vehicle.getVolume()){
			throw new TooManyThingsException();
		}
		volume -= vehicle.getVolume();
		vehicles.add(vehicle);
	}

	public void removeVehicle(Vehicle vehicle){
		volume += vehicle.getVolume();
		vehicles.remove(vehicle);
	}
}
