package com.company.models;

public class Vehicle {
    private String name;
    private double volume;

    public Vehicle(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public Vehicle() {
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }
}
