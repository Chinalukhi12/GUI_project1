package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class Tenant  {
    private String name;
    private String surname;
    private String peselNumber;
    private String Adress;
    private int TenantNo;
    private List<TenantLetter>tenantLetters;

    public Tenant(String name, String surname, String peselNumber, String adress, int TenantNo) {
        this.name = name;
        this.surname = surname;
        this.peselNumber = peselNumber;
        this.Adress = adress;
        this.TenantNo = TenantNo;
        tenantLetters = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPeselNumber() {
        return peselNumber;
    }

    public void setPeselNumber(String peselNumber) {
        this.peselNumber = peselNumber;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public int getTenantNo() {
        return TenantNo;
    }

    public void setTenantNo(int tenantNo) {
        TenantNo = tenantNo;
    }

    public List<TenantLetter> getTenantLetters() {
        return tenantLetters;
    }

//    public void setTenantLetters(List<TenantLetter> tenantLetters) {
//        this.tenantLetters = tenantLetters;
//    }
}
