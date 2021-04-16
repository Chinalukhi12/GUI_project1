package com.company.models;

public class items {
    private String name;
    private double volume;

    public items(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public items() {
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }
}
