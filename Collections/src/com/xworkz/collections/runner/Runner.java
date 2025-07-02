package com.xworkz.collections.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Collection<String> bike=new ArrayList<>();

        bike.add("R15");
        bike.add("BMW");
        bike.add("Rx100");
        bike.add("Aprilia");
        bike.add("rc");
        bike.add("activa");
        bike.add("Bmw");
        bike.add("FZ");
        bike.add("ZX10R");

        System.out.println("Size Before  :"+bike.size());
        bike.clear();
        System.out.println("Size:"+bike.size());

        bike.add("rc");
        bike.add("activa");
        bike.add("Bmw");
        bike.add("FZ");
        bike.add("ZX10R");
        bike.add("rc");
        bike.add("activa");
        bike.add("Bmw");
        bike.add("FZ");
        bike.add("ZX10R");

        System.out.println("Size afterr:  "+bike.size());


        Collection<String> car = new ArrayList<>();
        car.add("Swift");
        car.add("Thar");
        car.add("Innova");
        car.add("Creta");
        car.add("XUV");
        car.add("Scorpio");

        System.out.println("\nCar Size Before : " + car.size());
        car.clear();
        System.out.println("Car Size After Clear: " + car.size());

        car.add("XUV");
        car.add("Scorpio");
        car.add("Creta");
        car.add("Innova");
        car.add("Swift");
        car.add("Swift");
        car.add("Thar");

        System.out.println("Car Size After Add: " + car.size());

        Collection<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Grapes");

        System.out.println("\nFruits Size Before : " + fruits.size());
        fruits.clear();
        System.out.println("Fruits Size After Clear: " + fruits.size());

        fruits.add("Orange");
        fruits.add("Papaya");
        fruits.add("Guava");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");

        System.out.println("Fruits Size After Add: " + fruits.size());

        Collection<String> names = new ArrayList<>();
        names.add("Aryan");
        names.add("Neha");
        names.add("Rahul");
        names.add("Kiran");

        System.out.println("\nNames Size Before : " + names.size());
        names.clear();
        System.out.println("Names Size After Clear: " + names.size());

        names.add("Ravi");
        names.add("Kiran");
        names.add("Aryan");
        names.add("Neha");
        names.add("Aryan");

        System.out.println("Names Size After Add: " + names.size());

        Collection<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Kotlin");

        System.out.println("\nLanguages Size Before : " + languages.size());
        languages.clear();
        System.out.println("Languages Size After Clear: " + languages.size());

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        languages.add("C#");
        languages.add("Swift");
        languages.add("Go");

        System.out.println("Languages Size After Add: " + languages.size());
            }
        }


