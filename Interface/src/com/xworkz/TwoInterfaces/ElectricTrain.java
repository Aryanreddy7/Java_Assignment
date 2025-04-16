package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class ElectricTrain implements Movable, Rechargeable {
    public void move() { System.out.println("Electric train is moving."); }
    public void stop() { System.out.println("Electric train has stopped."); }
    public void accelerate() { System.out.println("Electric train is accelerating."); }
    public void charge() { System.out.println("Electric train is charging."); }
    public void disCharge() { System.out.println("Electric train is discharging."); }
    public void checkBatteryStatus() { System.out.println("Electric train battery status is OK."); }
}
