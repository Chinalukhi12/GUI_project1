package com.company.models;

public abstract class Space {
	protected String ID;
	protected double volume;
	protected Person primaryOwner;

	public String getID() {
		return ID;
	}

	public double getVolume() {
		return volume;
	}

	public Person getPrimaryOwner() {
		return primaryOwner;
	}

	public void setPrimaryOwner(Person primaryOwner) {
		this.primaryOwner = primaryOwner;
	}
}
