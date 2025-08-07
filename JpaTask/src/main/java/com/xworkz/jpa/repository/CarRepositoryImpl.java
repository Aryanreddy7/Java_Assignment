package com.xworkz.jpa.repository;

import com.xworkz.jpa.entity.CarEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.lang.management.ManagementFactory;

public class CarRepositoryImpl implements CarRepository {
    @Override
    public String save(CarEntity carEntity) {
        System.out.println("Running Save");
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Car");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(carEntity);
            entityTransaction.commit();
            System.out.println("ruu");


        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
        }

        return null;
    }

    @Override
    public CarEntity FindbyId(int id) {
        try {
            System.out.println("Running FindbyId");
            EntityManagerFactory entityManagerFactory;
            EntityManager entityManager;
            EntityTransaction entityTransaction;

            entityManagerFactory = Persistence.createEntityManagerFactory("Car");
            entityManager = entityManagerFactory.createEntityManager();

            CarEntity carEntity1 = entityManager.find(CarEntity.class,id);
            return carEntity1;

        } catch (Exception e) {
//            if(entityTransaction.isActive()){
//                entityTransaction.rollback();
        }

        return null;
    }

    @Override
    public CarEntity UpdateById(int id, String carname) {
        try {
            System.out.println("Running UpdateById in repo");
            EntityManagerFactory entityManagerFactory;
            EntityManager entityManager;
            EntityTransaction entityTransaction;

            entityManagerFactory = Persistence.createEntityManagerFactory("Car");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();
            CarEntity carEntity2 = entityManager.find(CarEntity.class,id);
            carEntity2.setCarname(carname);
            entityManager.merge(carEntity2);
            entityTransaction.commit();

            return carEntity2;

        } catch (Exception e) {
//            if(entityTransaction.isActive()){
//                entityTransaction.rollback();
        }
        return null;
    }

    @Override
    public CarEntity DeleteById(int id) {
        System.out.println("Running DeleteById");
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Car");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            CarEntity carEntity3 = entityManager.find(CarEntity.class,id);
            entityManager.remove(carEntity3);
            entityTransaction.commit();


        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
        }

        return null;
    }
}
