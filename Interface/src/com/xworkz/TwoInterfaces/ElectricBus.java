package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class ElectricBus implements Movable, Rechargeable {
        public void move() { System.out.println("Electric bus is moving."); }
        public void stop() { System.out.println("Electric bus has stopped."); }
        public void accelerate() { System.out.println("Electric bus is accelerating."); }
        public void charge() { System.out.println("Electric bus is charging."); }
        public void disCharge() { System.out.println("Electric bus is discharging."); }
        public void checkBatteryStatus() { System.out.println("Electric bus battery status is OK."); }
    }
