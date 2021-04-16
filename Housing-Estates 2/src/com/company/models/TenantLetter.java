package com.company.models;


public class TenantLetter extends Person {
    private String StartOfdate;
    private String EndOfDate;
    private String contractNo;


    public TenantLetter(String name, String surname, String peselNumber, String addres, boolean firstTenant, String contractNo, String startOfDate, String endOfDate) {
        super(name, surname, peselNumber, addres, firstTenant);
        this.StartOfdate = startOfDate;
        this.EndOfDate = endOfDate;
        this.contractNo = contractNo;
    }

    public String getStartOfdate() {
        return StartOfdate;
    }

    public void setStartOfdate(String startOfdate) {
        StartOfdate = startOfdate;
    }

    public String getEndOfDate() {
        return EndOfDate;
    }

    public void setEndOfDate(String endOfDate) {
        EndOfDate = endOfDate;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }
}


