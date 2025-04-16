package com.xworkz.ThreeInterfaces;

public class DigitalCamera implements Displayable, Controllable, Storable {
        public void display() {
            System.out.println("Digital Camera displaying captured photo");
        }

        public void showDetails() {
            System.out.println("Digital Camera details: brand, model, resolution");
        }

        public void updateInfo(String info) {
            System.out.println("Digital Camera updated with " + info);
        }

        public void start() {
            System.out.println("Digital Camera powering on");
        }

        public void stop() {
            System.out.println("Digital Camera powering off");
        }

        public void reset() {
            System.out.println("Digital Camera resetting to factory settings");
        }

        public void storeData(String data) {
            System.out.println("Digital Camera storing data: " + data);
        }

        public String retrieveData() {
            return "Digital Camera data";
        }

        public void deleteData() {
            System.out.println("Digital Camera data deleted");
        }
    }
