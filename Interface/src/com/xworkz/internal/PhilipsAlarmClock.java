package com.xworkz.internal;

public class PhilipsAlarmClock implements AlarmClock {
    public void setAlarm() {
        System.out.println("Setting alarm on Philips alarm clock");
    }
    public void snooze() {
        System.out.println("Snoozing alarm on Philips alarm clock");
    }
    public void stopAlarm() {
        System.out.println("Stopping alarm on Philips alarm clock");
    }
}
