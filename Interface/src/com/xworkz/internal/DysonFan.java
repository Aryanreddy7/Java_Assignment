package com.xworkz.internal;

public class DysonFan implements ElectricFan {
    public void turnOn() {
        System.out.println("Turning on Dyson fan");
    }
    public void turnOff() {
        System.out.println("Turning off Dyson fan");
    }
    public void adjustSpeed() {
        System.out.println("Adjusting speed on Dyson fan");
    }
}
