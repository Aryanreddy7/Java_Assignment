package com.xworkz.ThreeInterfaces;

public class Tablet implements Displayable, Controllable, Storable {
        public void display() {
            System.out.println("Tablet displaying home screen");
        }

        public void showDetails() {
            System.out.println("Tablet details: brand, model, screen size");
        }

        public void updateInfo(String info) {
            System.out.println("Tablet updated with " + info);
        }

        public void start() {
            System.out.println("Tablet powering on");
        }

        public void stop() {
            System.out.println("Tablet powering off");
        }

        public void reset() {
            System.out.println("Tablet resetting to factory settings");
        }

        public void storeData(String data) {
            System.out.println("Tablet storing data: " + data);
        }

        public String retrieveData() {
            return "Tablet data";
        }

        public void deleteData() {
            System.out.println("Tablet data deleted");
        }
    }
