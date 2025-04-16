package com.xworkz.internal;

public class FreightTruck implements Truck {
    public void loadCargo() {
        System.out.println("Loading cargo into Freight Truck");
    }
    public void unloadCargo() {
        System.out.println("Unloading cargo from Freight Truck");
    }
    public void startEngine() {
        System.out.println("Starting engine of Freight Truck");
    }
}
