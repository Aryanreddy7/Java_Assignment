package com.xworkz.ThreeInterfaces;

public class Television implements Displayable, Controllable, Storable {
    public void display() {
        System.out.println("Television displaying the current channel");
    }

    public void showDetails() {
        System.out.println("Television details: brand, model, screen size");
    }

    public void updateInfo(String info) {
        System.out.println("Television updated with " + info);
    }

    public void start() {
        System.out.println("Television powering on");
    }

    public void stop() {
        System.out.println("Television powering off");
    }

    public void reset() {
        System.out.println("Television resetting to factory settings");
    }

    public void storeData(String data) {
        System.out.println("Television storing data: " + data);
    }

    public String retrieveData() {
        return "Television data";
    }

    public void deleteData() {
        System.out.println("Television data deleted");
    }
}
