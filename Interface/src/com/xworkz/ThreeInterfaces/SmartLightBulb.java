package com.xworkz.ThreeInterfaces;

public class SmartLightBulb implements Displayable, Controllable, Storable {
    public void display() {
        System.out.println("Smart Light Bulb displaying current color and brightness");
    }

    public void showDetails() {
        System.out.println("Smart Light Bulb details: brand, model, color temperature");
    }

    public void updateInfo(String info) {
        System.out.println("Smart Light Bulb updated with " + info);
    }

    public void start() {
        System.out.println("Smart Light Bulb powering on");
    }

    public void stop() {
        System.out.println("Smart Light Bulb powering off");
    }

    public void reset() {
        System.out.println("Smart Light Bulb resetting to factory settings");
    }

    public void storeData(String data) {
        System.out.println("Smart Light Bulb storing data: " + data);
    }

    public String retrieveData() {
        return "Smart Light Bulb data";
    }

    public void deleteData() {
        System.out.println("Smart Light Bulb data deleted");
    }
}
