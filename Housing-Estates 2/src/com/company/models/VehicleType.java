package com.company.models;

public enum VehicleType {

	OFF_ROAD_CAR(800, EngineType.TYPE1),
	CITY_CAR(400, EngineType.TYPE1),
	BOAT(1100, EngineType.TYPE3),
	MOTORCYCLE(1000, EngineType.TYPE2),
	AMPHIBIOUS(2000, EngineType.TYPE3);

	private final double engineCapacity;
	private final EngineType engineType;

	VehicleType(double engineCapacity, EngineType engineType) {
		this.engineCapacity = engineCapacity;
		this.engineType = engineType;
	}

}
