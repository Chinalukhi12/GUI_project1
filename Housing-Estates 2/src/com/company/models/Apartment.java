package com.company.models;

import java.util.Map;
import java.util.Set;

public class Apartment {
	private String ID;
	private double volume;
	private Person primaryOwner;
	private Set<Person> occupiedBy;
	private Map<String, ParkingSpace> parkingSpaces;
	public static int count = 0;

	public Apartment(double length, double breadth, double height){
		this.ID = "APT-" + ++count;
		this.volume = length*breadth*height;
	}

	public Apartment(double volume){
		this.ID = "APT-" + ++count;
		this.volume = volume;
	}

	public void checkIn(Person person) {
		occupiedBy.add(person);
	}

	public void checkOut(Person person){
		occupiedBy.remove(person);
	}

	public Map<String, ParkingSpace> getParkingSpaces() {
		return parkingSpaces;
	}
}