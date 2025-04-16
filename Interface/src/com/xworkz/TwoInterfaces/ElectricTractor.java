package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class ElectricTractor implements Movable, Rechargeable {
    public void move() { System.out.println("Electric tractor is moving."); }
    public void stop() { System.out.println("Electric tractor has stopped."); }
    public void accelerate() { System.out.println("Electric tractor is accelerating."); }
    public void charge() { System.out.println("Electric tractor is charging."); }
    public void disCharge() { System.out.println("Electric tractor is discharging."); }
    public void checkBatteryStatus() { System.out.println("Electric tractor battery status is OK."); }
}
