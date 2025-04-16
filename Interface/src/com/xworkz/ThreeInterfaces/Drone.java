package com.xworkz.ThreeInterfaces;

public class Drone implements Displayable, Controllable, Storable {
    public void display() {
        System.out.println("Drone displaying current flight status");
    }

    public void showDetails() {
        System.out.println("Drone details: brand, model, battery status");
    }

    public void updateInfo(String info) {
        System.out.println("Drone updated with " + info);
    }

    public void start() {
        System.out.println("Drone powering on");
    }

    public void stop() {
        System.out.println("Drone powering off");
    }

    public void reset() {
        System.out.println("Drone resetting to factory settings");
    }

    public void storeData(String data) {
        System.out.println("Drone storing data: " + data);
    }

    public String retrieveData() {
        return "Drone data";
    }

    public void deleteData() {
        System.out.println("Drone data deleted");
    }
}
