package com.xworkz.internal;

public interface PaymentMethod {
    void authorize();
    void capture();
    void refund();
}
