package com.xworkz.internal;

public class DeliveryDrone implements Drone {
    public void takeOff() {
        System.out.println("Delivery drone taking off");
    }
    public void captureVideo() {
        System.out.println("Delivery drone capturing video");
    }
    public void land() {
        System.out.println("Delivery drone landing");
    }
}
