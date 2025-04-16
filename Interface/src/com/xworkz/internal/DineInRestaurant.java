package com.xworkz.internal;

public class DineInRestaurant implements Restaurant {
    public void takeOrder() {
        System.out.println("Taking order in dine-in restaurant");
    }
    public void serveFood() {
        System.out.println("Serving food in dine-in restaurant");
    }
    public void billCustomer() {
        System.out.println("Billing customer in dine-in restaurant");
    }
}
