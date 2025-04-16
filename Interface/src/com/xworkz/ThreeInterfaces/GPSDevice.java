package com.xworkz.ThreeInterfaces;

public class GPSDevice implements Displayable, Controllable, Storable {
    public void display() {
        System.out.println("GPS Device displaying current location");
    }

    public void showDetails() {
        System.out.println("GPS Device details: brand, model, location accuracy");
    }

    public void updateInfo(String info) {
        System.out.println("GPS Device updated with " + info);
    }

    public void start() {
        System.out.println("GPS Device powering on");
    }

    public void stop() {
        System.out.println("GPS Device powering off");
    }

    public void reset() {
        System.out.println("GPS Device resetting to factory settings");
    }

    public void storeData(String data) {
        System.out.println("GPS Device storing data: " + data);
    }

    public String retrieveData() {
        return "GPS Device data";
    }

    public void deleteData() {
        System.out.println("GPS Device data deleted");
    }
}
