package com.xworkz.internal;

public class Circle implements Shape {
    public double area() { return Math.PI * 5 * 5; }
    public double perimeter() { return 2 * Math.PI * 5; }
    public void draw() { System.out.println("Drawing Circle"); }
}
