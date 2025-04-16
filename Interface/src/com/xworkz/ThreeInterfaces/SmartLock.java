package com.xworkz.ThreeInterfaces;

public class SmartLock implements Displayable, Controllable, Storable {
    public void display() {
        System.out.println("Smart Lock displaying lock status");
    }

    public void showDetails() {
        System.out.println("Smart Lock details: brand, model, battery level");
    }

    public void updateInfo(String info) {
        System.out.println("Smart Lock updated with " + info);
    }

    public void start() {
        System.out.println("Smart Lock powering on");
    }

    public void stop() {
        System.out.println("Smart Lock powering off");
    }

    public void reset() {
        System.out.println("Smart Lock resetting to factory settings");
    }

    public void storeData(String data) {
        System.out.println("Smart Lock storing data: " + data);
    }

    public String retrieveData() {
        return "Smart Lock data";
    }

    public void deleteData() {
        System.out.println("Smart Lock data deleted");
    }
}
