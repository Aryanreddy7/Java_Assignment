package com.xworkz.Runner;

import com.xworkz.ThreeInterfaces.*;
import com.xworkz.ThreeInterfaces.CoffeeMachine;
import com.xworkz.ThreeInterfaces.Controllable;
import com.xworkz.ThreeInterfaces.Displayable;
import com.xworkz.ThreeInterfaces.Storable;
import com.xworkz.ThreeInterfaces.WashingMachine;
import com.xworkz.internal.*;

public class ThreeInterfacesRunner {
    public static void main(String[] args) {
        AirConditioner airConditioner=new AirConditioner();
        airConditioner.deleteData();
        airConditioner.retrieveData();
        airConditioner.storeData("Storing");
        airConditioner.reset();
        airConditioner.stop();
        airConditioner.start();
        airConditioner.display();
        airConditioner.showDetails();
        airConditioner.updateInfo("updating");
        System.out.println("====================================");
        Controllable controllable1 = new AirConditioner();
        controllable1.reset();
        controllable1.stop();
        controllable1.start();
        System.out.println("=============================");

        Displayable displayable1 = new AirConditioner();
        displayable1.display();
        displayable1.showDetails();
        displayable1.updateInfo("On");
        System.out.println("=============================");

        Storable storable1 = new AirConditioner();
        storable1.deleteData();
        storable1.retrieveData();
        storable1.storeData("Stored");
        System.out.println("=============================");

        Controllable controllable2 = new WashingMachine();
        controllable2.reset();
        controllable2.stop();
        controllable2.start();
        System.out.println("=============================");

        Displayable displayable2 = new WashingMachine();
        displayable2.display();
        displayable2.showDetails();
        displayable2.updateInfo("Quick Wash");
        System.out.println("=============================");

        Storable storable2 = new WashingMachine();
        storable2.deleteData();
        storable2.retrieveData();
        storable2.storeData("Wash Logs");
        System.out.println("=============================");

        Controllable controllable3 = new SmartFridge();
        controllable3.reset();
        controllable3.stop();
        controllable3.start();
        System.out.println("=============================");

        Displayable displayable3 = new SmartFridge();
        displayable3.display();
        displayable3.showDetails();
        displayable3.updateInfo("Cooling Fast");
        System.out.println("=============================");

        Storable storable3 = new SmartFridge();
        storable3.deleteData();
        storable3.retrieveData();
        storable3.storeData("Fridge Data");
        System.out.println("=============================");

        Controllable controllable4 = new CoffeeMachine();
        controllable4.reset();
        controllable4.stop();
        controllable4.start();
        System.out.println("=============================");

        Displayable displayable4 = new CoffeeMachine();
        displayable4.display();
        displayable4.showDetails();
        displayable4.updateInfo("Espresso Mode");
        System.out.println("=============================");

        Storable storable4 = new CoffeeMachine();
        storable4.deleteData();
        storable4.retrieveData();
        storable4.storeData("Brew Logs");
        System.out.println("=============================");

        Controllable controllable5 = new RobotVacuum();
        controllable5.reset();
        controllable5.stop();
        controllable5.start();
        System.out.println("=============================");

        Displayable displayable5 = new RobotVacuum();
        displayable5.display();
        displayable5.showDetails();
        displayable5.updateInfo("Full Room");
        System.out.println("=============================");

        Storable storable5 = new RobotVacuum();
        storable5.deleteData();
        storable5.retrieveData();
        storable5.storeData("Vacuum Path");
        System.out.println("=============================");

        Controllable controllable6 = new Smartwatch();
        controllable6.reset();
        controllable6.stop();
        controllable6.start();
        System.out.println("=============================");

        Displayable displayable6 = new Smartwatch();
        displayable6.display();
        displayable6.showDetails();
        displayable6.updateInfo("Heart Rate Monitoring");
        System.out.println("=============================");

        Storable storable6 = new Smartwatch();
        storable6.deleteData();
        storable6.retrieveData();
        storable6.storeData("Health Data");
        System.out.println("=============================");

    }
        }
