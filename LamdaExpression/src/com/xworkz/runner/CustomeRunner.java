package com.xworkz.runner;

import com.xworkz.lamda.Bottle;
import com.xworkz.lamda.Customer;

public class CustomeRunner {
    public static void  main(String[] args) {
//        Bottle bottle=(int no)->{
//            System.out.println("Runnning Lamda Impl"+no);
//            if(no>0){
//                return true;
//            }
//            return false;
//        };
        Customer customer=new Customer();
//        customer.buy(bottle);
        customer.buy((no) -> no>100);
    }
}
