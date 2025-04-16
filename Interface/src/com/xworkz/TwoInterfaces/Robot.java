package com.xworkz.TwoInterfaces;

import com.xworkz.internal.Movable;
import com.xworkz.internal.Rechargeable;

public class Robot implements Movable, Rechargeable {
        public void move() { System.out.println("Robot is moving."); }
        public void stop() { System.out.println("Robot has stopped."); }
        public void accelerate() { System.out.println("Robot is accelerating."); }
        public void charge() { System.out.println("Robot is charging."); }
        public void disCharge() { System.out.println("Robot is discharging."); }
        public void checkBatteryStatus() { System.out.println("Robot battery status is OK."); }
    }
