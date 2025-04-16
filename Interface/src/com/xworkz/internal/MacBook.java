package com.xworkz.internal;

public class MacBook implements Laptop {
    public void bootUp() {
        System.out.println("Booting up MacBook");
    }
    public void shutdown() {
        System.out.println("Shutting down MacBook");
    }
    public void runProgram() {
        System.out.println("Running program on MacBook");
    }
}
