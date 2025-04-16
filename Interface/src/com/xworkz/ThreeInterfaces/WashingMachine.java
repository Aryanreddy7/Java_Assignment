package com.xworkz.ThreeInterfaces;

public class WashingMachine implements Displayable, Controllable, Storable {
    public void display() {
        System.out.println("Washing Machine displaying cycle status and time");
    }

    public void showDetails() {
        System.out.println("Washing Machine details: brand, model, load capacity");
    }

    public void updateInfo(String info) {
        System.out.println("Washing Machine updated with " + info);
    }

    public void start() {
        System.out.println("Washing Machine powering on");
    }

    public void stop() {
        System.out.println("Washing Machine powering off");
    }

    public void reset() {
        System.out.println("Washing Machine resetting to factory settings");
    }

    public void storeData(String data) {
        System.out.println("Washing Machine storing data: " + data);
    }

    public String retrieveData() {
        return "Washing Machine data";
    }

    public void deleteData() {
        System.out.println("Washing Machine data deleted");
    }
}
