package com.company.models;

public class Flat extends Room {
    private String flatNo;

    public Flat(int roomNo, String flatNo, double weidt, String colour, double height) {
        super(height,
                weidt,
                colour,
                roomNo);
        this.flatNo= flatNo;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }
}
