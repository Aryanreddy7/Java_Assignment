package com.xworkz.internal;

public class NestThermostat implements Thermostat {
    public void increaseTemperature() {
        System.out.println("Increasing temperature on Nest thermostat");
    }
    public void decreaseTemperature() {
        System.out.println("Decreasing temperature on Nest thermostat");
    }
    public void setTimer() {
        System.out.println("Setting timer on Nest thermostat");
    }
}
