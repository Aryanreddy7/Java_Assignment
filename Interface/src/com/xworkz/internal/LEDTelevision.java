package com.xworkz.internal;

public class LEDTelevision implements Television {
    public void turnOn() {
        System.out.println("LED TV turned on");
    }
    public void changeChannel() {
        System.out.println("Changing channel on LED TV");
    }
    public void turnOff() {
        System.out.println("LED TV turned off");
    }
}
