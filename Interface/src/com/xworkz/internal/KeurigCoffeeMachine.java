package com.xworkz.internal;

public class KeurigCoffeeMachine implements CoffeeMachine {
    public void brewCoffee() {
        System.out.println("Brewing coffee with Keurig");
    }
    public void stopBrew() {
        System.out.println("Stopping coffee brew on Keurig");
    }
    public void setStrength() {
        System.out.println("Setting coffee strength on Keurig");
    }
}
