package com.xworkz.internal;

public class EmailNotification implements NotificationService {
    public void sendNotification() { System.out.println("Email sent"); }
    public void scheduleNotification() { System.out.println("Email scheduled"); }
    public void cancelNotification() { System.out.println("Email canceled"); }
}
