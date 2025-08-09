package com.xworkz.jpa.runner;

import com.xworkz.jpa.entity.CarEntity;
import com.xworkz.jpa.service.CarSerice;
import com.xworkz.jpa.service.CarServiceImpl;

public class CarRunner {
    public static void main(String[] args) {
        CarSerice carSerice=new CarServiceImpl();
        carSerice.run(new CarEntity(1,"Audi",1000));
        carSerice.run(new CarEntity(2,"bmw",1060));
        carSerice.run(new CarEntity(3,"porshe",1300));

        CarEntity carEntity=carSerice.FindbyId(1);
        System.out.println(carEntity.toString());

       CarEntity carEntity1=carSerice.UpdateById(2,"sfgehn");

       CarEntity carEntity2=carSerice.DeleteById(1);
    }
}
