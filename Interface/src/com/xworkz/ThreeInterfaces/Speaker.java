package com.xworkz.ThreeInterfaces;

public class Speaker implements Displayable, Controllable, Storable {
    public void display() {
        System.out.println("Speaker displaying volume level");
    }

    public void showDetails() {
        System.out.println("Speaker details: brand, model, sound quality");
    }

    public void updateInfo(String info) {
        System.out.println("Speaker updated with " + info);
    }

    public void start() {
        System.out.println("Speaker powering on");
    }

    public void stop() {
        System.out.println("Speaker powering off");
    }

    public void reset() {
        System.out.println("Speaker resetting to factory settings");
    }

    public void storeData(String data) {
        System.out.println("Speaker storing data: " + data);
    }

    public String retrieveData() {
        return "Speaker data";
    }

    public void deleteData() {
        System.out.println("Speaker data deleted");
    }
}
