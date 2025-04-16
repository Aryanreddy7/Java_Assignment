package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class ElectricTram implements Movable, Rechargeable {
    public void move() { System.out.println("Electric tram is moving."); }
    public void stop() { System.out.println("Electric tram has stopped."); }
    public void accelerate() { System.out.println("Electric tram is accelerating."); }
    public void charge() { System.out.println("Electric tram is charging."); }
    public void disCharge() { System.out.println("Electric tram is discharging."); }
    public void checkBatteryStatus() { System.out.println("Electric tram battery status is OK."); }
}
