package com.xworkz.internal;

public class CloudStorage implements FileStorage {
    public void upload() { System.out.println("File uploaded to cloud"); }
    public void download() { System.out.println("File downloaded from cloud"); }
    public void delete() { System.out.println("File deleted from cloud"); }
}
