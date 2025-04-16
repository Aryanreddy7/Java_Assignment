package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

    public class Hoverboard implements Movable, Rechargeable {
        public void move() { System.out.println("Hoverboard is moving."); }
        public void stop() { System.out.println("Hoverboard has stopped."); }
        public void accelerate() { System.out.println("Hoverboard is accelerating."); }
        public void charge() { System.out.println("Hoverboard is charging."); }
        public void disCharge() { System.out.println("Hoverboard is discharging."); }
        public void checkBatteryStatus() { System.out.println("Hoverboard battery status is OK."); }
    }
