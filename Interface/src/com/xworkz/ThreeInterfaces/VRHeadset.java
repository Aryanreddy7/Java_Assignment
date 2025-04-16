package com.xworkz.ThreeInterfaces;

public class VRHeadset implements Displayable, Controllable, Storable {
        public void display() {
            System.out.println("VR Headset displaying virtual environment");
        }

        public void showDetails() {
            System.out.println("VR Headset details: brand, model, battery level");
        }

        public void updateInfo(String info) {
            System.out.println("VR Headset updated with " + info);
        }

        public void start() {
            System.out.println("VR Headset powering on");
        }

        public void stop() {
            System.out.println("VR Headset powering off");
        }

        public void reset() {
            System.out.println("VR Headset resetting to factory settings");
        }

        public void storeData(String data) {
            System.out.println("VR Headset storing data: " + data);
        }

        public String retrieveData() {
            return "VR Headset data";
        }

        public void deleteData() {
            System.out.println("VR Headset data deleted");
        }
    }
