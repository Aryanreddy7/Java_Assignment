package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class Segway implements Movable, Rechargeable {
        public void move() { System.out.println("Segway is moving."); }
        public void stop() { System.out.println("Segway has stopped."); }
        public void accelerate() { System.out.println("Segway is accelerating."); }
        public void charge() { System.out.println("Segway is charging."); }
        public void disCharge() { System.out.println("Segway is discharging."); }
        public void checkBatteryStatus() { System.out.println("Segway battery status is OK."); }
    }
