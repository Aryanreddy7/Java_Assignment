package com.xworkz.internal;

public class EcobeeSmartThermostat implements SmartThermostat {
    public void adjustTemperature() {
        System.out.println("Adjusting temperature with Ecobee Smart Thermostat");
    }
    public void turnOff() {
        System.out.println("Turning off Ecobee Smart Thermostat");
    }
    public void programSchedule() {
        System.out.println("Programming schedule on Ecobee Smart Thermostat");
    }
}
