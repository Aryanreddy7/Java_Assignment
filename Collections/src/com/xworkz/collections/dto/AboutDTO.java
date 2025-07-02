package com.xworkz.collections.dto;

public class AboutDTO {
    private String name;
    private int age;
    private int weight;
    private String place;
    private String college_name;
    private double cgpa;
    private int rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public int getRollno() {
        return rollno;
    }


    public void setRollno(int rollno) {
        this.rollno = rollno;

    }


    public AboutDTO(String name, int age, int weight, String place, String college_name, double cgpa, int rollno) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.place = place;
        this.college_name = college_name;
        this.cgpa = cgpa;
        this.rollno = rollno;
    }

}
