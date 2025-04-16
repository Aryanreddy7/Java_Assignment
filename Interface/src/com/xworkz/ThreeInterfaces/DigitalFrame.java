package com.xworkz.ThreeInterfaces;

public class DigitalFrame implements Displayable, Controllable, Storable {
    public void display() {
        System.out.println("Digital Frame displaying current photo");
    }

    public void showDetails() {
        System.out.println("Digital Frame details: brand, model, screen resolution");
    }

    public void updateInfo(String info) {
        System.out.println("Digital Frame updated with " + info);
    }

    public void start() {
        System.out.println("Digital Frame powering on");
    }

    public void stop() {
        System.out.println("Digital Frame powering off");
    }

    public void reset() {
        System.out.println("Digital Frame resetting to factory settings");
    }

    public void storeData(String data) {
        System.out.println("Digital Frame storing data: " + data);
    }

    public String retrieveData() {
        return "Digital Frame data";
    }

    public void deleteData() {
        System.out.println("Digital Frame data deleted");
    }
}
