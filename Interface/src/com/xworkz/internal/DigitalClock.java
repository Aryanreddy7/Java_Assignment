package com.xworkz.internal;

public class DigitalClock implements Clock {
    public void showTime() { System.out.println("Showing current time"); }
    public void setAlarm() { System.out.println("Alarm set"); }
    public void stopAlarm() { System.out.println("Alarm stopped"); }
}
