package com.xworkz.internal;

public class AmazonEcho implements SmartSpeaker {
    public void playMusic() {
        System.out.println("Playing music on Amazon Echo");
    }
    public void pauseMusic() {
        System.out.println("Pausing music on Amazon Echo");
    }
    public void setAlarm() {
        System.out.println("Setting alarm on Amazon Echo");
    }
}
