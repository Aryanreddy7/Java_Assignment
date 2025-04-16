package com.xworkz.internal;

public class Uber implements TransportService {
    public void bookRide() {
        System.out.println("Booking a ride with Uber");
    }
    public void startRide() {
        System.out.println("Starting Uber ride");
    }
    public void endRide() {
        System.out.println("Ending Uber ride");
    }
}
