package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class Drone implements Movable, Rechargeable {
        public void move() { System.out.println("Drone is flying."); }
        public void stop() { System.out.println("Drone has stopped."); }
        public void accelerate() { System.out.println("Drone is accelerating."); }
        public void charge() { System.out.println("Drone is charging."); }
        public void disCharge() { System.out.println("Drone is discharging."); }
        public void checkBatteryStatus() { System.out.println("Drone battery status is OK."); }
    }
