package com.xworkz.ThreeInterfaces;

public class CoffeeMachine implements Displayable, Controllable, Storable {
    public void display() {
        System.out.println("Coffee Machine displaying current brewing status");
    }

    public void showDetails() {
        System.out.println("Coffee Machine details: brand, model, brew strength");
    }

    public void updateInfo(String info) {
        System.out.println("Coffee Machine updated with " + info);
    }

    public void start() {
        System.out.println("Coffee Machine powering on");
    }

    public void stop() {
        System.out.println("Coffee Machine powering off");
    }

    public void reset() {
        System.out.println("Coffee Machine resetting to factory settings");
    }

    public void storeData(String data) {
        System.out.println("Coffee Machine storing data: " + data);
    }

    public String retrieveData() {
        return "Coffee Machine data";
    }

    public void deleteData() {
        System.out.println("Coffee Machine data deleted");
    }
}
