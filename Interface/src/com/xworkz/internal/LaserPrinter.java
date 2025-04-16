package com.xworkz.internal;

public class LaserPrinter implements Printer {
    public void print() { System.out.println("Printing document"); }
    public void scan() { System.out.println("Scanning document"); }
    public void cancel() { System.out.println("Cancelling job"); }
}
