package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class ElectricSnowmobile implements Movable, Rechargeable {
    public void move() { System.out.println("Electric snowmobile is moving."); }
    public void stop() { System.out.println("Electric snowmobile has stopped."); }
    public void accelerate() { System.out.println("Electric snowmobile is accelerating."); }
    public void charge() { System.out.println("Electric snowmobile is charging."); }
    public void disCharge() { System.out.println("Electric snowmobile is discharging."); }
    public void checkBatteryStatus() { System.out.println("Electric snowmobile battery status is OK."); }
}
