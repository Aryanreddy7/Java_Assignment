package com.xworkz.exception.creator;

import javax.sound.sampled.LineUnavailableException;

public class EventCreator {

    public void checkedEvent() throws LineUnavailableException {
        if(true){
            System.out.println("Running");
            throw new LineUnavailableException("Checking exception");
        }
    }
}
