package com.xworkz.ThreeInterfaces;

public class SmartThermostat implements Displayable, Controllable, Storable {
    public void display() {
        System.out.println("Smart Thermostat displaying current temperature and settings");
    }

    public void showDetails() {
        System.out.println("Smart Thermostat details: brand, model, energy usage");
    }

    public void updateInfo(String info) {
        System.out.println("Smart Thermostat updated with " + info);
    }

    public void start() {
        System.out.println("Smart Thermostat powering on");
    }

    public void stop() {
        System.out.println("Smart Thermostat powering off");
    }

    public void reset() {
        System.out.println("Smart Thermostat resetting to factory settings");
    }

    public void storeData(String data) {
        System.out.println("Smart Thermostat storing data: " + data);
    }

    public String retrieveData() {
        return "Smart Thermostat data";
    }

    public void deleteData() {
        System.out.println("Smart Thermostat data deleted");
    }
}
