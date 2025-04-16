package com.xworkz.internal;

public class Netflix implements StreamingService {
    public void playContent() {
        System.out.println("Playing content on Netflix");
    }
    public void pauseContent() {
        System.out.println("Pausing content on Netflix");
    }
    public void stopContent() {
        System.out.println("Stopping content on Netflix");
    }
}
