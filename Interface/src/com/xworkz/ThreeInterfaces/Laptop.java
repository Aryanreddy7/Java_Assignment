package com.xworkz.ThreeInterfaces;

public class Laptop implements Displayable, Controllable, Storable {
        public void display() {
            System.out.println("Laptop displaying desktop screen");
        }

        public void showDetails() {
            System.out.println("Laptop details: brand, model, processor");
        }

        public void updateInfo(String info) {
            System.out.println("Laptop updated with " + info);
        }

        public void start() {
            System.out.println("Laptop powering on");
        }

        public void stop() {
            System.out.println("Laptop powering off");
        }

        public void reset() {
            System.out.println("Laptop resetting to factory settings");
        }

        public void storeData(String data) {
            System.out.println("Laptop storing data: " + data);
        }

        public String retrieveData() {
            return "Laptop data";
        }

        public void deleteData() {
            System.out.println("Laptop data deleted");
        }
    }
