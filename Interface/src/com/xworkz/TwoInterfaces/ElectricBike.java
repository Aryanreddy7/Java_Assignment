package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

    public class ElectricBike implements Movable, Rechargeable {
        public void move() { System.out.println("Electric bike is moving."); }
        public void stop() { System.out.println("Electric bike has stopped."); }
        public void accelerate() { System.out.println("Electric bike is accelerating."); }
        public void charge() { System.out.println("Electric bike is charging."); }
        public void disCharge() { System.out.println("Electric bike is discharging."); }
        public void checkBatteryStatus() { System.out.println("Electric bike battery status is OK."); }
    }
