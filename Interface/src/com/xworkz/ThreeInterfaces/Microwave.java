package com.xworkz.ThreeInterfaces;

public class Microwave implements Displayable, Controllable, Storable {
        public void display() {
            System.out.println("Microwave displaying settings");
        }

        public void showDetails() {
            System.out.println("Microwave details: brand, model, power");
        }

        public void updateInfo(String info) {
            System.out.println("Microwave updated with " + info);
        }

        public void start() {
            System.out.println("Microwave powering on");
        }

        public void stop() {
            System.out.println("Microwave powering off");
        }

        public void reset() {
            System.out.println("Microwave resetting to factory settings");
        }

        public void storeData(String data) {
            System.out.println("Microwave storing data: " + data);
        }

        public String retrieveData() {
            return "Microwave data";
        }

        public void deleteData() {
            System.out.println("Microwave data deleted");
        }
    }
