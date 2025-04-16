package com.xworkz.ThreeInterfaces;

public class Refrigerator implements Displayable, Controllable, Storable {
        public void display() {
            System.out.println("Refrigerator displaying temperature");
        }

        public void showDetails() {
            System.out.println("Refrigerator details: brand, model, capacity");
        }

        public void updateInfo(String info) {
            System.out.println("Refrigerator updated with " + info);
        }

        public void start() {
            System.out.println("Refrigerator powering on");
        }

        public void stop() {
            System.out.println("Refrigerator powering off");
        }

        public void reset() {
            System.out.println("Refrigerator resetting to factory settings");
        }

        public void storeData(String data) {
            System.out.println("Refrigerator storing data: " + data);
        }

        public String retrieveData() {
            return "Refrigerator data";
        }

        public void deleteData() {
            System.out.println("Refrigerator data deleted");
        }
    }
