package com.xworkz.exception.creator;

import javax.sound.sampled.LineUnavailableException;

public class Runner {
    public static void main(String[] args) throws LineUnavailableException {
        EventCreator exception=new EventCreator();
        exception.checkedEvent();
    }



}
