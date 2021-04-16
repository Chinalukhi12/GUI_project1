package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class ParkingPlace {
    private String number;
    private String name;
    private double volume;
    private double height;
    private double length;
    private double width;
    private List<items> item;
    private List<Vehicle> vehicles;
    private static double totalVolume=0;

    public ParkingPlace(String name, String number, double height, double length, double width) {
        this.name = name;
        this.number = number;
        this.height = height;
        this.length = length;
        this.width = width;
        this.volume = height * length * width;
//        item = new ArrayList<>();
//        vehicles= new ArrayList<>();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private List<items> items;

    private List<Vehicle> vehicle;

    private static double getTotalVolume=0;


    public void addItems(items item) {
        totalVolume+= item.getVolume();
        if (this.volume >= totalVolume) {
            this.item.add(item);
        } else {

            throw new IllegalArgumentException("Parking Place is full");
        }
    }
    public void addVehicle(Vehicle vehicle){
        totalVolume+= vehicle.getVolume();
        if (this.volume >= totalVolume) {
            this.vehicles.add(vehicle);
        } else {
            throw new IllegalArgumentException("Parking Place is full");
        }
    }
    public void RemoveItems(String name){ //eklemek icin kontrol yapmamiz lazim eger otopark bossa
        if(totalVolume==0){
            throw  new IllegalArgumentException("Parking place is empity");
        } else {
            for(int i=0; i<item.size(); i++ ){ // item burada parametre
                if(item.get(i).getName().equals(this.name)) {
                    totalVolume = item.get(i).getVolume();
                    this.item.remove(i);
                }
            }
        }
    }
    public void RemoveVehicle(String name){ //eklemek icin kontrol yapmamiz lazim eger otopark bossa
        if(totalVolume==0){
            throw  new IllegalArgumentException("Parking place is empity");
        } else {
            for(int i=0; i<vehicles.size(); i++ ){
                if(vehicles.get(i).getName().equals(this.name)) {
                    totalVolume = vehicles.get(i).getVolume();
                    this.vehicles.remove(i);
                }
            }
        }
    }
}



