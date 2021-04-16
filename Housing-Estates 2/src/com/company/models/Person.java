package com.company.models;

import java.util.Map;

public class Person {

	private int spacesRented;
	private static final int MAX_SPACE_RENTED = 5;
	private Map<String, Apartment> apartments;
	private Map<String, Apartment> ownedApartments; // Apartment this person is tenant to

	// Check in and check out self
	public void checkIn(String id){
		if (ownedApartments.containsKey(id)){
			ownedApartments.get(id).checkIn(this);
		}
	}

	public void checkOut(String id){
		if (ownedApartments.containsKey(id)){
			ownedApartments.get(id).checkOut(this);
		}
	}

	// check in and check out other members
	public void checkIn(String id, Person person){
		if (ownedApartments.containsKey(id)){
			ownedApartments.get(id).checkIn(this);
		}
	}

	public void checkOut(String id, Person person){
		if (ownedApartments.containsKey(id)){
			ownedApartments.get(id).checkOut(this);
		}
	}


	// Add item to a parking space
	public void insertItemToParkingSpace(String parkingSpaceID, Item item){
		for (Map.Entry<String, Apartment> apartments: ownedApartments.entrySet()){
			if (apartments.getValue().getParkingSpaces().containsKey(parkingSpaceID)){
				apartments.getValue().getParkingSpaces().get(parkingSpaceID).addItem(item);

				break;
			}
		}
	}

	// Add vehicle to a parking space
	public void insertVehicleToParkingSpace(String parkingSpaceID, Vehicle vehicle){
		for (Map.Entry<String, Apartment> apartments: ownedApartments.entrySet()){
			if (apartments.getValue().getParkingSpaces().containsKey(parkingSpaceID)){
				apartments.getValue().getParkingSpaces().get(parkingSpaceID).addVehicle(vehicle);

				break;
			}
		}
	}

	// Take Out item to a parking space
	public void takeOutItemFromParkingSpace(String parkingSpaceID, Item item){
		for (Map.Entry<String, Apartment> apartments: ownedApartments.entrySet()){
			if (apartments.getValue().getParkingSpaces().containsKey(parkingSpaceID)){
				apartments.getValue().getParkingSpaces().get(parkingSpaceID).removeItem(item);

				break;
			}
		}
	}

	// Take Out vehicle to a parking space
	public void takeOutVehicleFromParkingSpace(String parkingSpaceID, Vehicle vehicle){
		for (Map.Entry<String, Apartment> apartments: ownedApartments.entrySet()){
			if (apartments.getValue().getParkingSpaces().containsKey(parkingSpaceID)){
				apartments.getValue().getParkingSpaces().get(parkingSpaceID).removeVehicle(vehicle);

				break;
			}
		}
	}

}
