package com.xworkz.ThreeInterfaces;

public class RobotVacuum implements Displayable, Controllable, Storable {
    public void display() {
        System.out.println("Robot Vacuum displaying cleaning progress");
    }

    public void showDetails() {
        System.out.println("Robot Vacuum details: brand, model, battery life");
    }

    public void updateInfo(String info) {
        System.out.println("Robot Vacuum updated with " + info);
    }

    public void start() {
        System.out.println("Robot Vacuum powering on");
    }

    public void stop() {
        System.out.println("Robot Vacuum powering off");
    }

    public void reset() {
        System.out.println("Robot Vacuum resetting to factory settings");
    }

    public void storeData(String data) {
        System.out.println("Robot Vacuum storing data: " + data);
    }

    public String retrieveData() {
        return "Robot Vacuum data";
    }

    public void deleteData() {
        System.out.println("Robot Vacuum data deleted");
    }
}
