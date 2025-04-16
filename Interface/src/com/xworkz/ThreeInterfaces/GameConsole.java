package com.xworkz.ThreeInterfaces;

public class GameConsole implements Displayable, Controllable, Storable {
    public void display() {
        System.out.println("Game Console displaying game interface");
    }

    public void showDetails() {
        System.out.println("Game Console details: brand, model, game library");
    }

    public void updateInfo(String info) {
        System.out.println("Game Console updated with " + info);
    }

    public void start() {
        System.out.println("Game Console powering on");
    }

    public void stop() {
        System.out.println("Game Console powering off");
    }

    public void reset() {
        System.out.println("Game Console resetting to factory settings");
    }

    public void storeData(String data) {
        System.out.println("Game Console storing data: " + data);
    }

    public String retrieveData() {
        return "Game Console data";
    }

    public void deleteData() {
        System.out.println("Game Console data deleted");
    }
}
