package com.xworkz.internal;

public class LGFridge implements Fridge {
    public void cool() {
        System.out.println("Cooling in LG fridge");
    }
    public void defrost() {
        System.out.println("Defrosting LG fridge");
    }
    public void adjustTemperature() {
        System.out.println("Adjusting temperature on LG fridge");
    }
}
