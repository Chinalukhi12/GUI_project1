package com.company.models;

public class Vehicle {
	private String name;
	private double volume;
	private VehicleType vehicleType;

	public Vehicle(String name, double volume, VehicleType vehicleType){
		this.name = name;
		this.volume = volume;
		this.vehicleType = vehicleType;
	}

	public Vehicle(String name, double length, double breadth, double height, VehicleType vehicleType){
		this.name = name;
		this.volume = length*breadth*height;
		this.vehicleType = vehicleType;
	}

	public double getVolume(){
		return this.volume;
	}
}
