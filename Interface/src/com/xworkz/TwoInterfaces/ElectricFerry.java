package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class ElectricFerry implements Movable, Rechargeable {
    public void move() { System.out.println("Electric ferry is moving."); }
    public void stop() { System.out.println("Electric ferry has stopped."); }
    public void accelerate() { System.out.println("Electric ferry is accelerating."); }
    public void charge() { System.out.println("Electric ferry is charging."); }
    public void disCharge() { System.out.println("Electric ferry is discharging."); }
    public void checkBatteryStatus() { System.out.println("Electric ferry battery status is OK."); }
}
