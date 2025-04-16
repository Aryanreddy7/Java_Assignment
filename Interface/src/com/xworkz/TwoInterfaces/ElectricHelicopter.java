package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class ElectricHelicopter implements Movable, Rechargeable {
    public void move() { System.out.println("Electric helicopter is flying."); }
    public void stop() { System.out.println("Electric helicopter has stopped."); }
    public void accelerate() { System.out.println("Electric helicopter is accelerating."); }
    public void charge() { System.out.println("Electric helicopter is charging."); }
    public void disCharge() { System.out.println("Electric helicopter is discharging."); }
    public void checkBatteryStatus() { System.out.println("Electric helicopter battery status is OK."); }
}
