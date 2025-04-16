package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class Car implements Movable, Rechargeable {
        public void move() { System.out.println("Car is moving."); }
        public void stop() { System.out.println("Car has stopped."); }
        public void accelerate() { System.out.println("Car is accelerating."); }
        public void charge() { System.out.println("Car is charging."); }
        public void disCharge() { System.out.println("Car is discharging."); }
        public void checkBatteryStatus() { System.out.println("Car battery status is OK."); }
    }



