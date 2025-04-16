package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class ElectricForklift implements Movable, Rechargeable {
    public void move() { System.out.println("Electric forklift is moving."); }
    public void stop() { System.out.println("Electric forklift has stopped."); }
    public void accelerate() { System.out.println("Electric forklift is accelerating."); }
    public void charge() { System.out.println("Electric forklift is charging."); }
    public void disCharge() { System.out.println("Electric forklift is discharging."); }
    public void checkBatteryStatus() { System.out.println("Electric forklift battery status is OK."); }
}
