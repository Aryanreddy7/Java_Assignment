package com.xworkz.ThreeInterfaces;

public class Smartwatch implements Displayable, Controllable, Storable {
        public void display() {
            System.out.println("Smartwatch displaying time and notifications");
        }

        public void showDetails() {
            System.out.println("Smartwatch details: brand, model, battery level");
        }

        public void updateInfo(String info) {
            System.out.println("Smartwatch updated with " + info);
        }

        public void start() {
            System.out.println("Smartwatch powering on");
        }

        public void stop() {
            System.out.println("Smartwatch powering off");
        }

        public void reset() {
            System.out.println("Smartwatch resetting to factory settings");
        }

        public void storeData(String data) {
            System.out.println("Smartwatch storing data: " + data);
        }

        public String retrieveData() {
            return "Smartwatch data";
        }

        public void deleteData() {
            System.out.println("Smartwatch data deleted");
        }
    }
