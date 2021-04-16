package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String surname;
    private String peselNumber;
    private String Address;
    private List<Flat> Flat;
    private List<ParkingPlace> ParkingPlace;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<com.company.models.Flat> getFlat() {
        return Flat;
    }

    public void setFlat(List<com.company.models.Flat> flat) {
        Flat = flat;
    }

    public List<com.company.models.ParkingPlace> getParkingPlace() {
        return ParkingPlace;
    }

    public void setParkingPlace(List<com.company.models.ParkingPlace> parkingPlace) {
        ParkingPlace = parkingPlace;
    }

    private boolean firstTenant;

    public Person() {
    }

    public Person(String name, String surname, String peselNumber, String address, boolean firstTenant) {
        this.name = name;
        this.surname = surname;
        this.peselNumber = peselNumber;
        this.Address = address;
        Flat = new ArrayList<>();
        ParkingPlace = new ArrayList<>();
        this.firstTenant = firstTenant;
    }
    public void GetFlat (Flat flat){
        if(Flat.size()>5){
            throw  new IllegalArgumentException(("I cannot rent more than 5 apartmant"));
        } else{
            this.Flat.add((flat)); //icine paremetre koyduk
        }

    }
    public void GetParkingPlace (ParkingPlace parkingPlace){
        if(Flat.size()>5){
            throw  new IllegalArgumentException(("I cannot rent more than 5 Parking place"));
        } else{
            this.ParkingPlace.add((parkingPlace)); //icine paremetre koyduk
        }

    }
}
