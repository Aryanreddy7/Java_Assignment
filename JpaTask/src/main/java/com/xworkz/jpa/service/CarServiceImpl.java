package com.xworkz.jpa.service;

import com.xworkz.jpa.entity.CarEntity;
import com.xworkz.jpa.repository.CarRepository;
import com.xworkz.jpa.repository.CarRepositoryImpl;

public class CarServiceImpl implements CarSerice{

    @Override
    public String run(CarEntity carEntity) {
        System.out.println("Running run");

        CarRepository carRepository=new CarRepositoryImpl();
        carRepository.save(carEntity);
        return null;
    }

    @Override
    public CarEntity FindbyId(int id) {
        System.out.println("Running FindbyId");
        CarRepository carRepository=new CarRepositoryImpl();


        return carRepository.FindbyId(id);
    }

    @Override
    public CarEntity UpdateById(int id, String carname) {
        System.out.println("Ruunnning UpdateById in service");
        CarRepository carRepository1=new CarRepositoryImpl();
        return carRepository1.UpdateById(id,carname);
    }

    @Override
    public CarEntity DeleteById(int id) {
        System.out.println("Running DeleteById in service");
        CarRepository carRepository2=new CarRepositoryImpl();
        return carRepository2.DeleteById(id);
    }
}
