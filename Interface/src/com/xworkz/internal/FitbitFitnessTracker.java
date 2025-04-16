package com.xworkz.internal;

public class FitbitFitnessTracker implements FitnessTracker {
    public void trackSteps() {
        System.out.println("Tracking steps with Fitbit");
    }
    public void monitorHeartRate() {
        System.out.println("Monitoring heart rate with Fitbit");
    }
    public void setGoals() {
        System.out.println("Setting fitness goals on Fitbit");
    }
}
