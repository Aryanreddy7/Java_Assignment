package com.xworkz.internal;

public class WiFiRouter implements Router {
    public void connectDevice() {
        System.out.println("Device connected to WiFi");
    }
    public void disconnectDevice() {
        System.out.println("Device disconnected from WiFi");
    }
    public void restart() {
        System.out.println("WiFi restarted");
    }
}
