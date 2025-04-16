package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class ElectricYacht implements Movable, Rechargeable {
    public void move() { System.out.println("Electric yacht is sailing."); }
    public void stop() { System.out.println("Electric yacht has stopped."); }
    public void accelerate() { System.out.println("Electric yacht is accelerating."); }
    public void charge() { System.out.println("Electric yacht is charging."); }
    public void disCharge() { System.out.println("Electric yacht is discharging."); }
    public void checkBatteryStatus() { System.out.println("Electric yacht battery status is OK."); }
}
