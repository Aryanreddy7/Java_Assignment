package com.xworkz.internal;

public class EpsonScanner implements Scanner {
    public void scanDocument() {
        System.out.println("Scanning document with Epson scanner");
    }
    public void clearScan() {
        System.out.println("Clearing scan on Epson scanner");
    }
    public void save() {
        System.out.println("Saving scan with Epson scanner");
    }
}
