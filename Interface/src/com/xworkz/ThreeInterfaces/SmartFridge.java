package com.xworkz.ThreeInterfaces;

public class SmartFridge implements Displayable, Controllable, Storable {
    public void display() {
        System.out.println("Smart Fridge displaying current temperature and settings");
    }

    public void showDetails() {
        System.out.println("Smart Fridge details: brand, model, energy rating");
    }

    public void updateInfo(String info) {
        System.out.println("Smart Fridge updated with " + info);
    }

    public void start() {
        System.out.println("Smart Fridge powering on");
    }

    public void stop() {
        System.out.println("Smart Fridge powering off");
    }

    public void reset() {
        System.out.println("Smart Fridge resetting to factory settings");
    }

    public void storeData(String data) {
        System.out.println("Smart Fridge storing data: " + data);
    }

    public String retrieveData() {
        return "Smart Fridge data";
    }

    public void deleteData() {
        System.out.println("Smart Fridge data deleted");
    }
}
