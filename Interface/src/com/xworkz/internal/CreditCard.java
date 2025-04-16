package com.xworkz.internal;

public class CreditCard implements PaymentMethod {
    public void authorize() { System.out.println("Credit card authorized"); }
    public void capture() { System.out.println("Payment captured by credit card"); }
    public void refund() { System.out.println("Credit card refunded"); }
}
