package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

    public class ElectricCarriage implements Movable, Rechargeable {
        public void move() { System.out.println("Electric carriage is moving."); }
        public void stop() { System.out.println("Electric carriage has stopped."); }
        public void accelerate() { System.out.println("Electric carriage is accelerating."); }
        public void charge() { System.out.println("Electric carriage is charging."); }
        public void disCharge() { System.out.println("Electric carriage is discharging."); }
        public void checkBatteryStatus() { System.out.println("Electric carriage battery status is OK."); }
    }
