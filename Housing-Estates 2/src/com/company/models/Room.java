package com.company.models;

public abstract class Room {
    private int roomNo;
    double height;
    double weidt;
    String colour;


    public Room( double height, double weidt, String colour,int roomNo) {

        this.roomNo=roomNo;
        this.height = height;
        this.weidt = weidt;
        this.colour=colour;
    }


    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getColour() {

        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double leight) {
        this.height = leight;
    }

    public double getWeidt() {
        return weidt;
    }

    public void setWeidt(double weidt) {
        this.weidt = weidt;
    }
}
