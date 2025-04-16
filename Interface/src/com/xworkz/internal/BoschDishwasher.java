package com.xworkz.internal;

public class BoschDishwasher implements Dishwasher {
    public void startWash() {
        System.out.println("Starting wash cycle on Bosch dishwasher");
    }
    public void stopWash() {
        System.out.println("Stopping wash cycle on Bosch dishwasher");
    }
    public void addDetergent() {
        System.out.println("Adding detergent to Bosch dishwasher");
    }
}
