package com.xworkz.application.dto;

import java.io.Serializable;

public class PassportDTO implements Serializable {
    private String applicantName;
    private String aadharNo;
    private String address;
    private String panNo;
    private String country;
    private String state;
    private String city;
    private String pinCode;
    private String passportType;
    private String paymentReference;

    public PassportDTO() {
        System.out.println("Running no-arg const in PassportDTO");
    }

    public PassportDTO(String applicantName, String aadharNo, String address, String panNo, String country, String state, String city, String pinCode, String passportType, String paymentReference) {
        this.applicantName = applicantName;
        this.aadharNo = aadharNo;
        this.address = address;
        this.panNo = panNo;
        this.country = country;
        this.state = state;
        this.city = city;
        this.pinCode = pinCode;
        this.passportType = passportType;
        this.paymentReference = paymentReference;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getPassportType() {
        return passportType;
    }

    public void setPassportType(String passportType) {
        this.passportType = passportType;
    }

    public String getPaymentReference() {
        return paymentReference;
    }

    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
    }
}
