package com.xworkz.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
//        Map<Integer,String[]> map=new HashMap<>();
//        map.put(5000, new String[]{"SVR sagar Pg", "yxcyfh"});
//        map.put(6000,new String[]{"REddy PG"});
//        System.out.println("The PG for this money is "+ Arrays.toString(map.get(6000)));

        Map<Integer,String> map=new HashMap<>();
        map.put(5000,"Jai PG");
        map.put(7000,"ARyan PG");
        map.put(8000,"Surya PG");
        System.out.println("The PG for this money is "+ map.get(5000));

    }
}
