package com.xworkz.jpa.service;

import com.xworkz.jpa.entity.CarEntity;

public interface CarSerice {
    public String run(CarEntity carEntity);

    CarEntity FindbyId(int id);
    CarEntity UpdateById(int id,String carname);
    CarEntity DeleteById(int id);

}
