package com.xworkz.internal;

public class AugustSmartLock implements SmartLock {
    public void lock() {
        System.out.println("Locking August Smart Lock");
    }
    public void unlock() {
        System.out.println("Unlocking August Smart Lock");
    }
    public void checkBattery() {
        System.out.println("Checking battery on August Smart Lock");
    }
}
