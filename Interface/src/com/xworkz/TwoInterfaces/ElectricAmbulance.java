package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class ElectricAmbulance implements Movable, Rechargeable {
    public void move() { System.out.println("Electric ambulance is moving."); }
    public void stop() { System.out.println("Electric ambulance has stopped."); }
    public void accelerate() { System.out.println("Electric ambulance is accelerating."); }
    public void charge() { System.out.println("Electric ambulance is charging."); }
    public void disCharge() { System.out.println("Electric ambulance is discharging."); }
    public void checkBatteryStatus() { System.out.println("Electric ambulance battery status is OK."); }
}
