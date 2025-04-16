package com.xworkz.internal;

public class WebBrowser implements Browser {
    public void openPage() { System.out.println("Opening web page"); }
    public void refreshPage() { System.out.println("Refreshing web page"); }
    public void closePage() { System.out.println("Closing web page"); }
}
