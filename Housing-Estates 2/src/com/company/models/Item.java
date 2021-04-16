package com.company.models;

public class Item {
	private String name;
	private double volume;

	public Item(String name, double volume){
		this.name = name;
		this.volume = volume;
	}

	public Item(String name, double length, double breadth, double height){
		this.name = name;
		this.volume = length*breadth*height;
	}

	public double getVolume() {
		return volume;
	}
}
