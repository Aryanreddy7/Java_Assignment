package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

    public class ElectricScooter implements Movable, Rechargeable {
        public void move() { System.out.println("Electric scooter is moving."); }
        public void stop() { System.out.println("Electric scooter has stopped."); }
        public void accelerate() { System.out.println("Electric scooter is accelerating."); }
        public void charge() { System.out.println("Electric scooter is charging."); }
        public void disCharge() { System.out.println("Electric scooter is discharging."); }
        public void checkBatteryStatus() { System.out.println("Electric scooter battery status is OK."); }
    }
