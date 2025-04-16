package com.xworkz.ThreeInterfaces;

    public class Smartphone implements Displayable, Controllable, Storable {
        public void display() {
            System.out.println("Smartphone displaying home screen");
        }

        public void showDetails() {
            System.out.println("Smartphone details: brand, model, OS");
        }

        public void updateInfo(String info) {
            System.out.println("Smartphone updated with " + info);
        }

        public void start() {
            System.out.println("Smartphone powering on");
        }

        public void stop() {
            System.out.println("Smartphone powering off");
        }

        public void reset() {
            System.out.println("Smartphone resetting to factory settings");
        }

        public void storeData(String data) {
            System.out.println("Smartphone storing data: " + data);
        }

        public String retrieveData() {
            return "Smartphone data";
        }

        public void deleteData() {
            System.out.println("Smartphone data deleted");
        }
    }




