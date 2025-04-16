package com.xworkz.internal;

public class NestSmokeDetector implements SmokeDetector {
    public void detectSmoke() {
        System.out.println("Detecting smoke with Nest Smoke Detector");
    }
    public void alert() {
        System.out.println("Alerting with Nest Smoke Detector");
    }
    public void test() {
        System.out.println("Testing Nest Smoke Detector");
    }
}
