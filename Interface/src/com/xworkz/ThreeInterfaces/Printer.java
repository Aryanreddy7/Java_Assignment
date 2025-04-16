package com.xworkz.ThreeInterfaces;

public class Printer implements Displayable, Controllable, Storable {
    public void display() {
        System.out.println("Printer displaying current print job status");
    }

    public void showDetails() {
        System.out.println("Printer details: brand, model, print speed");
    }

    public void updateInfo(String info) {
        System.out.println("Printer updated with " + info);
    }

    public void start() {
        System.out.println("Printer powering on");
    }

    public void stop() {
        System.out.println("Printer powering off");
    }

    public void reset() {
        System.out.println("Printer resetting to factory settings");
    }

    public void storeData(String data) {
        System.out.println("Printer storing data: " + data);
    }

    public String retrieveData() {
        return "Printer data";
    }

    public void deleteData() {
        System.out.println("Printer data deleted");
    }
}
