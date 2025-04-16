package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class ElectricSubmarine implements Movable, Rechargeable {
    public void move() { System.out.println("Electric submarine is moving."); }
    public void stop() { System.out.println("Electric submarine has stopped."); }
    public void accelerate() { System.out.println("Electric submarine is accelerating."); }
    public void charge() { System.out.println("Electric submarine is charging."); }
    public void disCharge() { System.out.println("Electric submarine is discharging."); }
    public void checkBatteryStatus() { System.out.println("Electric submarine battery status is OK."); }
}
