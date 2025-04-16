package com.xworkz.internal;

public class DSLR implements Camera {
    public void capture() { System.out.println("Photo captured"); }
    public void zoom() { System.out.println("Zooming in"); }
    public void record() { System.out.println("Recording video"); }
}
