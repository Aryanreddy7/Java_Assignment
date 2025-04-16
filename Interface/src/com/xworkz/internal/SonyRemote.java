package com.xworkz.internal;

public class SonyRemote implements TelevisionRemote {
    public void powerOn() {
        System.out.println("Turning on Sony TV");
    }
    public void changeChannel() {
        System.out.println("Changing channel on Sony TV");
    }
    public void adjustVolume() {
        System.out.println("Adjusting volume on Sony TV");
    }
}
