package com.xworkz.internal;

public class DysonVacuumCleaner implements VacuumCleaner {
    public void start() {
        System.out.println("Starting Dyson vacuum cleaner");
    }
    public void stop() {
        System.out.println("Stopping Dyson vacuum cleaner");
    }
    public void adjustPower() {
        System.out.println("Adjusting power on Dyson vacuum cleaner");
    }
}
