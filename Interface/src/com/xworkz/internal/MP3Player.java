package com.xworkz.internal;

public class MP3Player implements MusicPlayer {
    public void play() { System.out.println("Playing music"); }
    public void pause() { System.out.println("Pausing music"); }
    public void stop() { System.out.println("Stopping music"); }
}
