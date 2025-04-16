package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class ElectricCrane implements Movable, Rechargeable {
    public void move() { System.out.println("Electric crane is moving."); }
    public void stop() { System.out.println("Electric crane has stopped."); }
    public void accelerate() { System.out.println("Electric crane is accelerating."); }
    public void charge() { System.out.println("Electric crane is charging."); }
    public void disCharge() { System.out.println("Electric crane is discharging."); }
    public void checkBatteryStatus() { System.out.println("Electric crane battery status is OK."); }
}
