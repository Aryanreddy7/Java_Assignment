package com.xworkz.internal;

public class CityBus implements Bus {
    public void boardPassenger() {
        System.out.println("Boarding passengers on City Bus");
    }
    public void startRoute() {
        System.out.println("Starting route on City Bus");
    }
    public void stopRoute() {
        System.out.println("Stopping route on City Bus");
    }
}
