package com.xworkz.internal;

public class WhirlpoolWashingMachine implements WashingMachine {
    public void startCycle() {
        System.out.println("Starting washing cycle on Whirlpool washing machine");
    }
    public void stopCycle() {
        System.out.println("Stopping washing cycle on Whirlpool washing machine");
    }
    public void addDetergent() {
        System.out.println("Adding detergent to Whirlpool washing machine");
    }
}
