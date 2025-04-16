package com.xworkz.internal;

public class MySQLDatabase implements Database {
    public void connect() { System.out.println("Connected to MySQL"); }
    public void query() { System.out.println("Executing MySQL query"); }
    public void disconnect() { System.out.println("Disconnected from MySQL"); }
}
