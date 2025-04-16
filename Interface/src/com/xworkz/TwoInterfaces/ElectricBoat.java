package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;
    public class ElectricBoat implements Movable, Rechargeable {
        public void move() { System.out.println("Electric boat is moving."); }
        public void stop() { System.out.println("Electric boat has stopped."); }
        public void accelerate() { System.out.println("Electric boat is accelerating."); }
        public void charge() { System.out.println("Electric boat is charging."); }
        public void disCharge() { System.out.println("Electric boat is discharging."); }
        public void checkBatteryStatus() { System.out.println("Electric boat battery status is OK."); }
    }
