package com.xworkz.internal;

public class SamsungMicrowave implements Microwave {
    public void start() {
        System.out.println("Starting the microwave");
    }
    public void stop() {
        System.out.println("Stopping the microwave");
    }
    public void setTimer() {
        System.out.println("Setting timer on microwave");
    }
}
