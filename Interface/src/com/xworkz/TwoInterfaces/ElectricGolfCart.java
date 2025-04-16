package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class ElectricGolfCart implements Movable, Rechargeable {
    public void move() { System.out.println("Electric golf cart is moving."); }
    public void stop() { System.out.println("Electric golf cart has stopped."); }
    public void accelerate() { System.out.println("Electric golf cart is accelerating."); }
    public void charge() { System.out.println("Electric golf cart is charging."); }
    public void disCharge() { System.out.println("Electric golf cart is discharging."); }
    public void checkBatteryStatus() { System.out.println("Electric golf cart battery status is OK."); }
}
