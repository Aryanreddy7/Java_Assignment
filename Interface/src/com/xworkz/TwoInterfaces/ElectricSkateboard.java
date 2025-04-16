package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class ElectricSkateboard implements Movable, Rechargeable {
        public void move() { System.out.println("Electric skateboard is moving."); }
        public void stop() { System.out.println("Electric skateboard has stopped."); }
        public void accelerate() { System.out.println("Electric skateboard is accelerating."); }
        public void charge() { System.out.println("Electric skateboard is charging."); }
        public void disCharge() { System.out.println("Electric skateboard is discharging."); }
        public void checkBatteryStatus() { System.out.println("Electric skateboard battery status is OK."); }
    }
