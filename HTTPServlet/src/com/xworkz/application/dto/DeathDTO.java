package com.xworkz.application.dto;

import java.io.Serializable;

public class DeathDTO implements Serializable {
    private String name;
    private String cause;
    private String date;
    private String time;
    private int age;
    private String certifiedBy;
    private String hospitalName;
    private String mannerOfDeath;
    private String gender;
    private String marks;

    public DeathDTO() {
        System.out.println("Running no-arg const in DeathDTO");
    }

    public DeathDTO(String name, String cause, String date, String time, int age, String certifiedBy, String hospitalName, String mannerOfDeath, String gender, String marks) {
        this.name = name;
        this.cause = cause;
        this.date = date;
        this.time = time;
        this.age = age;
        this.certifiedBy = certifiedBy;
        this.hospitalName = hospitalName;
        this.mannerOfDeath = mannerOfDeath;
        this.gender = gender;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCertifiedBy() {
        return certifiedBy;
    }

    public void setCertifiedBy(String certifiedBy) {
        this.certifiedBy = certifiedBy;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getMannerOfDeath() {
        return mannerOfDeath;
    }

    public void setMannerOfDeath(String mannerOfDeath) {
        this.mannerOfDeath = mannerOfDeath;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }
}
