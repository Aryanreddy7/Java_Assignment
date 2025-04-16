package com.xworkz.internal;

public class BrevilleElectricKettle implements ElectricKettle {
    public void boilWater() {
        System.out.println("Boiling water with Breville electric kettle");
    }
    public void stopBoiling() {
        System.out.println("Stopping boiling water with Breville electric kettle");
    }
    public void setTemperature() {
        System.out.println("Setting temperature on Breville electric kettle");
    }
}
