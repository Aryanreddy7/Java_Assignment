package com.xworkz.collections.runner;

import com.xworkz.collections.dto.AboutDTO;

import java.util.ArrayList;
import java.util.Collection;

public class AboutRunner {
    public static void main(String[] args) {
        Collection<AboutDTO> aboutdto=new ArrayList<>();
        aboutdto.add(new AboutDTO("Aryan",12,56,"Davangere","biet",80,12));
        aboutdto.add(new AboutDTO("Surya",12,56,"dvg","GMIT",60,13));
        aboutdto.add(new AboutDTO("Reddy",12,56,"banglore","jain",70,14));
        aboutdto.add(new AboutDTO("Pooja", 21, 50, "Mysore", "SJCE", 85, 15));
        aboutdto.add(new AboutDTO("Manoj", 22, 68, "Hubli", "KLE Tech", 75, 16));
        aboutdto.add(new AboutDTO("Sneha", 20, 55, "Shimoga", "PESIT", 90, 17));
        aboutdto.add(new AboutDTO("Raj", 23, 72, "Chikmagalur", "AIT", 78, 18));
        aboutdto.add(new AboutDTO("Aisha", 19, 48, "Mangalore", "NITK", 88, 19));
        aboutdto.add(new AboutDTO("Kiran", 24, 65, "Tumkur", "SIT", 82, 20));
        aboutdto.add(new AboutDTO("Divya", 22, 52, "Hassan", "HIT", 91, 21));


        for (AboutDTO about:aboutdto){
            System.out.println("names are :"+about.getName());
            System.out.println("Ages are :"+about.getAge());
            System.out.println("weight are :"+about.getWeight());
            System.out.println("Place names are :"+about.getPlace());
            System.out.println("Collage names are :"+about.getCollege_name());
            System.out.println("Cgpa are :"+about.getCgpa());
            System.out.println("Rollno are :"+about.getRollno());

            System.out.println("=================");

        }
    }
}
