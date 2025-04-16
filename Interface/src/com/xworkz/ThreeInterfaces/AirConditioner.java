package com.xworkz.ThreeInterfaces;

public class AirConditioner implements Displayable, Controllable, Storable {
    public void display() {
        System.out.println("Air Conditioner displaying current temperature and mode");
    }

    public void showDetails() {
        System.out.println("Air Conditioner details: brand, model, cooling capacity");
    }

    public void updateInfo(String info) {
        System.out.println("Air Conditioner updated with " + info);
    }

    public void start() {
        System.out.println("Air Conditioner powering on");
    }

    public void stop() {
        System.out.println("Air Conditioner powering off");
    }

    public void reset() {
        System.out.println("Air Conditioner resetting to factory settings");
    }

    public void storeData(String data) {
        System.out.println("Air Conditioner storing data: " + data);
    }

    public String retrieveData() {
        return "Air Conditioner data";
    }

    public void deleteData() {
        System.out.println("Air Conditioner data deleted");
    }
}
