package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class ElectricTruck implements Movable, Rechargeable {
    public void move() { System.out.println("Electric truck is moving."); }
    public void stop() { System.out.println("Electric truck has stopped."); }
    public void accelerate() { System.out.println("Electric truck is accelerating."); }
    public void charge() { System.out.println("Electric truck is charging."); }
    public void disCharge() { System.out.println("Electric truck is discharging."); }
    public void checkBatteryStatus() { System.out.println("Electric truck battery status is OK."); }
}
