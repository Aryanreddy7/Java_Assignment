package com.xworkz.ThreeInterfaces;

public class EReader implements Displayable, Controllable, Storable {
    public void display() {
        System.out.println("E-Reader displaying current book page");
    }

    public void showDetails() {
        System.out.println("E-Reader details: brand, model, battery life");
    }

    public void updateInfo(String info) {
        System.out.println("E-Reader updated with " + info);
    }

    public void start() {
        System.out.println("E-Reader powering on");
    }

    public void stop() {
        System.out.println("E-Reader powering off");
    }

    public void reset() {
        System.out.println("E-Reader resetting to factory settings");
    }

    public void storeData(String data) {
        System.out.println("E-Reader storing data: " + data);
    }

    public String retrieveData() {
        return "E-Reader data";
    }

    public void deleteData() {
        System.out.println("E-Reader data deleted");
    }
}
