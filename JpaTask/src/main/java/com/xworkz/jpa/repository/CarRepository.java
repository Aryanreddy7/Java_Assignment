package com.xworkz.jpa.repository;

import com.xworkz.jpa.entity.CarEntity;

public interface CarRepository {
    String save(CarEntity carEntity);

    CarEntity FindbyId(int id);
    CarEntity UpdateById(int id,String carname);
    CarEntity DeleteById(int id);

}
