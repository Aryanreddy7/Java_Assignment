package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class ElectricWheelchair implements Movable, Rechargeable {
        public void move() { System.out.println("Electric wheelchair is moving."); }
        public void stop() { System.out.println("Electric wheelchair has stopped."); }
        public void accelerate() { System.out.println("Electric wheelchair is accelerating."); }
        public void charge() { System.out.println("Electric wheelchair is charging."); }
        public void disCharge() { System.out.println("Electric wheelchair is discharging."); }
        public void checkBatteryStatus() { System.out.println("Electric wheelchair battery status is OK."); }
    }
