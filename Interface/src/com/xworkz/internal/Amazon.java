package com.xworkz.internal;

public class Amazon implements ECommercePlatform {
    public void browseItems() {
        System.out.println("Browsing items on Amazon");
    }
    public void addToCart() {
        System.out.println("Adding item to cart on Amazon");
    }
    public void checkout() {
        System.out.println("Checking out on Amazon");
    }
}
